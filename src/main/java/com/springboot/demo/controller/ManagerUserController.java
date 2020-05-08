package com.springboot.demo.controller;


import com.springboot.demo.bean.ManagerUser;
import com.springboot.demo.bean.ResponseResult;
import com.springboot.demo.service.ManagerUserService;
import com.springboot.demo.util.ImageUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.HtmlUtils;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/manager")
public class ManagerUserController {

    @Resource
    private ManagerUserService managerUserService;
    /**
     * 超级管理员登录操作
     * @param user
     * @param session
     * @return
     */
    @RequestMapping("/checkLogin")
    public ResponseResult<String> checkLogin(@RequestBody ManagerUser user, HttpSession session){
        ResponseResult<String> rr = null;
        String username = user.getUsername();
        username = HtmlUtils.htmlEscape(username);  //转换编码

        //采用shiro进行登录安全验证
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, user.getPassword());
        try {
            //即验证,执行登录操作,不通过抛出异常
            subject.login(token);
            rr = new ResponseResult<String>(1, "成功");
            rr.setData("");
            ManagerUser managerUser = managerUserService.getManagerUserByUsername(username);
            session.setAttribute("user", managerUser);
        } catch (Exception e) {
            String str = "用户名或密码错误,请重新输入";
            rr = new ResponseResult<String>(0, "失败");
            rr.setData(str);
        }
        return rr;
    }


    /**
     * 获取超级管理员信息信息
     * @param id
     * @return
     */
    @RequestMapping("/getManagerUserById")
    public ManagerUser getManagerUserById(Integer id){
        return managerUserService.findOneManagerUser(id);
    }

    /**
     * 修改用户信息
     * 若是通过bean对象接收,需要加上responseBody注解
     * 此处采用的方法是先获取旧盐与新密码进行集成加密以后的密码,若出现密码与数据库密码不同
     * 此时采取的操作是重新生成盐,并切重新保存盐和新密码.若相同,则不改变盐进行数据保存
     * @param user
     * @return
     */
    @RequestMapping("/changeManagerUserMsg")
    public String changeManagerUserMsg(@RequestBody ManagerUser user, HttpSession session){
        String username = user.getUsername();
        String password = user.getPassword();
        username = HtmlUtils.htmlEscape(username);  //转换编码
        user.setUsername(username);
        ManagerUser oldUser = getManagerUserById(user.getId()); //通过当前传参id获取用户,进行比对密码
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
        managerUserService.updateManagerUser(user);  //修改用户信息
        //判断是否修改的当前登录用户信息
        ManagerUser nowUser = (ManagerUser)session.getAttribute("user");
        if(user.getId() == nowUser.getId()){
            if (!user.getName().equals(nowUser.getPassword())){
                session.setAttribute("user",user);
            }
        }
        return "用户信息修改成功";
    }


    /**
     * 添加超级管理员头像
     * @param id
     * @param image
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/updateManagerImage")
    public Object updateImage1(Integer id , MultipartFile image, HttpServletRequest request )  throws IOException {
        File imageFolder= new File(request.getServletContext().getRealPath("image/admin"));
        File file = new File(imageFolder,id+".jpg");
        String fileName = file.getName();
        if(!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        image.transferTo(file); //复制图片
        BufferedImage img = ImageUtil.change2jpg(file);
        ImageIO.write(img, "jpg", file); //转换jpg格式
        File small_file = new File(request.getServletContext().getRealPath("image/admin/small_Image"),fileName);
        small_file.getParentFile().mkdirs();
        ImageUtil.resizeImage(file, 80, 60, small_file);
        if(file.isFile()) {
            file.delete();
        }
        return "";
    }

}
