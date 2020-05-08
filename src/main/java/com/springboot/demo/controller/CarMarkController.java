package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.CarMark;
import com.springboot.demo.service.CarMarkService;
import com.springboot.demo.util.ImageUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 汽车标志控制器层
 */
@RestController
@RequestMapping("/carMark")
public class CarMarkController {

    @Resource
    private CarMarkService carMarkService;

    /**
     * 添加汽车车标信息
     * @param carMark
     * @return
     */
    @RequestMapping("/addOneCarMark")
    public String addOneCarMark(@RequestBody CarMark carMark){
        carMarkService.addOneCarMark(carMark);
        return "添加成功";
    }

    /**
     * 修改汽车标志信息
     * @param carMark
     * @return
     */
    @RequestMapping("/updateOneCarMark")
    public String updateOneCarMark(@RequestBody CarMark carMark){
        carMarkService.updateOneCarMark(carMark);
        return "修改成功";
    }

    /**
     * 通过id删除用户信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteOneCarMark")
    public String deleteOneCarMark(Integer id,HttpServletRequest request){
        File imageFolder= new File(request.getServletContext().getRealPath("image/carMark/small_Image"));
        File file = new File(imageFolder,id+".jpg");
        if (file.isFile()){
            file.delete();
        }
        carMarkService.deleteOneCarMark(id);
        return "";
    }

    /**
     * 通过id获取一个汽车标志信息
     * @param id
     * @return
     */
    @RequestMapping("/getOneCarMark")
    public CarMark getOneCarMark(Integer id){
        return carMarkService.findOneCarMark(id);
    }

    /**
     * 获取某一页汽车标志
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listCarMark")
    public PageInfo<CarMark> listCarMark(@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                      @RequestParam(value = "size" , defaultValue = "5") Integer size,
                                         String name){
        if(start == null || start < 1){
            start = 1;
        }
        return  carMarkService.findAllCarMark(start,size,name);
    }

    /**
     * 修改汽车标志图片
     * @param id
     * @param image
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/updateImage")
    public Object updateImage(Integer id , MultipartFile image, HttpServletRequest request )  throws IOException {
        File imageFolder= new File(request.getServletContext().getRealPath("image/carMark"));
        File file = new File(imageFolder,id+".jpg");
        String fileName = file.getName();
        if(!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        image.transferTo(file); //复制图片
        BufferedImage img = ImageUtil.change2jpg(file);
        ImageIO.write(img, "jpg", file); //转换jpg格式
        File small_file = new File(request.getServletContext().getRealPath("image/carMark/small_Image"),fileName);
        small_file.getParentFile().mkdirs();
        ImageUtil.resizeImage(file, 100, 90, small_file);
        if(file.isFile()) {
            file.delete();
        }
        return "";
    }

}
