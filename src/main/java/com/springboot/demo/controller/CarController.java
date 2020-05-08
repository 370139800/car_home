package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.Car;
import com.springboot.demo.service.CarService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 汽车控制器
 */
@RestController
@RequestMapping("/car")
public class CarController {

    @Resource
    private CarService carService;

    @RequestMapping("/updateOneCar")
    public String updateOneCar(@RequestBody Car car){
        carService.updateOneCar(car);
        return "修改成功";
    }

    @RequestMapping("/getOneCar")
    public Car getOneCar(Integer id){
        return carService.getOneCar(id);
    }
    /**
     * 添加一个车
     * @param car
     * @return
     */
    @RequestMapping("/addOneCar")
    public String addOneCar(@RequestBody Car car){
        carService.addOneCar(car);
        return "添加成功";
    }

    @RequestMapping("/deleteOneCar")
    public String deleteOneCar(Integer id){
        carService.deleteOneCar(id);
        return "删除成功";
    }

    @RequestMapping("/listAllCar")
    public PageInfo<Car> listAllCar(Integer ccategoryId,@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                     @RequestParam(value = "size" , defaultValue = "5") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return carService.listAllCar(ccategoryId,start,size);
    }

}
