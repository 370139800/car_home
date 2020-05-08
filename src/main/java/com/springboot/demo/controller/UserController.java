package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.ResponseResult;
import com.springboot.demo.bean.User;
import com.springboot.demo.service.UserService;
import com.springboot.demo.util.ImageUtil;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.HtmlUtils;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 获取分页用户信息
     * 用户想要看第几页,数值就是几.不在是索引通过0表示第一页
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listUser")
    public PageInfo<User> listUser(@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                   @RequestParam(value = "size" , defaultValue = "5") Integer size,
                                    String username){
        if(start == null || start < 1){
            start = 1;
        }
        return  userService.finAllUser(start,size,username);
    }

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @RequestMapping("/getUserById")
    public User getUserById(Integer id){
        return userService.findOneUser(id);
    }

    /**
     * 修改用户信息
     * 若是通过bean对象接收,需要加上responseBody注解
     * 此处采用的方法是先获取旧盐与新密码进行集成加密以后的密码,若出现密码与数据库密码不同
     * 此时采取的操作是重新生成盐,并切重新保存盐和新密码.若相同,则不改变盐进行数据保存
     * @param user
     * @return
     */
    @RequestMapping("/changeUserMsg")
    public String changeUserMsg(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        username = HtmlUtils.htmlEscape(username);  //转换编码
        user.setUsername(username);
        User oldUser = getUserById(user.getId()); //通过当前传参id获取用户,进行比对密码
        //采用md5加密进行加密保存
        String salt = oldUser.getSalt();
        int times = 2;
        String algorithmName = "md5";
        //采用md5进行加密操作
        String encodedPassword = new SimpleHash(algorithmName, password, salt, times).toString();  //旧盐与新密码生成的数据
        if(oldUser.getPassword().equals(encodedPassword)){  //判断是否是密码有所改动
            user.setSalt(salt);
            user.setPassword(encodedPassword);
        }else{ //如果不相等的话
            salt = new SecureRandomNumberGenerator().nextBytes().toString(); // 重新获取盐
            encodedPassword = new SimpleHash(algorithmName, password, salt, times).toString();
            user.setSalt(salt);
            user.setPassword(encodedPassword);
        }
        userService.changeUserMsg(user);  //修改用户信息
        return "用户信息修改成功";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/removeUser")
    public String removeUser(Integer id,HttpServletRequest request){
        File imageFolder= new File(request.getServletContext().getRealPath("image/user/small_Image"));
        File file = new File(imageFolder,id+".jpg");
        if (file.isFile()){
            file.delete();
        }
        userService.removeUser(id);
        return "删除成功";
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping("/addOneUser")
    public String addOneUser(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        username = HtmlUtils.htmlEscape(username);  //转换编码
        user.setUsername(username);

        //采用md5加密进行加密保存
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        int times = 2;
        String algorithmName = "md5";
        //采用md5进行加密操作
        String encodedPassword = new SimpleHash(algorithmName, password, salt, times).toString();

        user.setPassword(encodedPassword);
        user.setSalt(salt);

        userService.addUser(user);
        return "添加成功";
    }

    /**
     * 通过用户名获取用户信息
     * @param username
     * @return
     */
    @RequestMapping("/getByUsername")
    public ResponseResult<String> getByUsername(String username){
        ResponseResult<String> rr =null;
        User user = userService.getUserByUsername(username);
        if(user==null) {
            rr = new ResponseResult<>(1, "成功");
            rr.setData("");
        }else {
            rr = new ResponseResult<>(0, "失败");
            rr.setData("用户名已存在,请重新输入");
        }
        return rr;
    }

    /**
     * 在页面查找用户名时采用这个方法
     * @return
     */
    @RequestMapping("/selectOneByUsername")
    public User selectOneByUsername(String username){
        return userService.getUserByUsername(username);
    }

    /**
     * 添加用户头像
     * @param id
     * @param image
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/updateImage")
    public Object updateImage(Integer id , MultipartFile image,HttpServletRequest request )  throws IOException {
        File imageFolder= new File(request.getServletContext().getRealPath("image/user"));
        File file = new File(imageFolder,id+".jpg");
        String fileName = file.getName();
        if(!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        image.transferTo(file); //复制图片
        BufferedImage img = ImageUtil.change2jpg(file);
        ImageIO.write(img, "jpg", file); //转换jpg格式
        File small_file = new File(request.getServletContext().getRealPath("image/user/small_Image"),fileName);
        small_file.getParentFile().mkdirs();
        ImageUtil.resizeImage(file, 80, 60, small_file);
        if(file.isFile()) {
            file.delete();
        }
     	return "";
    }




}