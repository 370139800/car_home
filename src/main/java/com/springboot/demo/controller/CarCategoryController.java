package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.CarCategory;
import com.springboot.demo.service.CarCategoryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * 汽车种类控制器
 */
@RestController
@RequestMapping("/carCategory")
public class CarCategoryController {

    @Resource
    private CarCategoryService carCategoryService;

    /**
     * 上传视频
     * @param id
     * @param vidio
     * @param request
     * @return
     */
    @RequestMapping("/addVidio")
    public String addVidio(Integer id, MultipartFile vidio, HttpServletRequest request ) {
        File imageFolder= new File(request.getServletContext().getRealPath("carVideo"));
        File file = new File(imageFolder,id+".mp4");
        if(!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        try{
            vidio.transferTo(file); //复制到carVideo
        }catch(Exception e) {
            return "上传失败";
        }
        return "上传成功";
    }

    /**
     * 获取某一个汽车种类
     * @param id
     * @return
     */
    @RequestMapping("/getOneCarCategory")
    public CarCategory getOneCarCategory(Integer id){
        return carCategoryService.getOneCarCategory(id);
    }

    /**
     * 修改汽车种类
     * @param carCategory
     * @return
     */
    @RequestMapping("/updateCarCategory")
    public String updateCarCategory(@RequestBody CarCategory carCategory){
        carCategoryService.updateCarCategory(carCategory);
        return "修改成功";
    }

    /**
     * 删除指定id得类
     * @param id
     * @return
     */
    @RequestMapping("/deleteCarCategory")
    public String deleteCarCategory(Integer id){
        carCategoryService.deleteCarCategory(id);
        return "";
    }
    /**
     * 添加汽车种类
     * @param carCategory
     * @return
     */
    @RequestMapping("/addCarCategory")
    public String addCarCategory(@RequestBody CarCategory carCategory){
        carCategoryService.addCarCategory(carCategory);
        return "";
    }

    /**
     * 获取一级分类
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listStairCarCategory")
    public PageInfo<CarCategory> listStairCarCategory(@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                      @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return  carCategoryService.listStairCarCategory(start,size);
    }

    /**
     * 获取二级分类
     * @param parentId
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listSecondCarCategory")
    public PageInfo<CarCategory> listSecondCarCategory(Integer parentId,@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                                      @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return  carCategoryService.listSecondCarCategory(parentId,start,size);
    }
}
