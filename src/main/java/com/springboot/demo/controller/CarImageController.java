package com.springboot.demo.controller;

import com.springboot.demo.bean.CarImage;
import com.springboot.demo.service.CarImageService;
import com.springboot.demo.util.ImageUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/carImage")
public class CarImageController {

    @Resource
    private CarImageService carImageService;

    /**
     * 显示当前汽车的图片
     * @param ccarId
     * @return
     */
    @RequestMapping("/listAllCarImage")
    public List<CarImage> listAllCarImage(Integer ccarId){
        List<CarImage> carImages = carImageService.listAllCarImage(ccarId);
        return carImages;
    }

    @RequestMapping("/addCarImage")
    public String addCarImage(Integer ccarId, MultipartFile image, HttpServletRequest request) throws IOException {
        CarImage carImage = carImageService.addCar(ccarId); //添加并获取到carImage
        File imageFolder= new File(request.getServletContext().getRealPath("image/car"));
        File file = new File(imageFolder,carImage.getId()+".jpg");
        String fileName = file.getName();
        if(!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        image.transferTo(file); //复制图片
        BufferedImage img = ImageUtil.change2jpg(file);
        ImageIO.write(img, "jpg", file); //转换jpg格式
        File middle_file = new File(request.getServletContext().getRealPath("image/car/middle_car"),fileName);
        middle_file.getParentFile().mkdirs();
        ImageUtil.resizeImage(file, 200, 180, middle_file);
        if(file.isFile()) {
            file.delete();
        }
        return "";
    }

    /**
     * 删除指定id汽车
     * @param id
     * @return
     */
    @RequestMapping("/deleteCarImage")
    public String deleteCarImage(Integer id,HttpServletRequest request){
        carImageService.deleteCarImage(id);
        File imageFolder= new File(request.getServletContext().getRealPath("image/car/middle_car"));
        File file = new File(imageFolder,id+".jpg");
        if(file.isFile()){
            file.delete();
        }
        return "删除成功";
    }

    /**
     * 获取汽车图片数量
     * @param ccarId
     * @return
     */
    @RequestMapping("/getCountCarImage")
    public String getCountCarImage(Integer ccarId){
       Integer count = carImageService.getCountCarImage(ccarId);
       return count + "";
    }
}
