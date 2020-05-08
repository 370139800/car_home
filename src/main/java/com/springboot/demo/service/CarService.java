package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.Car;
import com.springboot.demo.dao.CarDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 汽车业务层
 */
@Service
public class CarService {

    @Resource
    private CarDao carDao;

    /**
     * 获取当前种类id下的所有汽车并进行分页保存
     * @param ccategoryId
     * @param start
     * @param size
     * @return
     */
    public PageInfo<Car> listAllCar(Integer ccategoryId,int start , int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<Car> carMarks = carDao.listAllCar(ccategoryId);
        PageInfo<Car> pages = new PageInfo<>(carMarks,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除指定id信息
     * @param id
     */
    public void deleteOneCar(Integer id){
        carDao.deleteOneCar(id);
    }

    /**
     * 添加一个汽车
     * @param car
     */
    public void addOneCar(Car car){
        carDao.addOneCar(car);
    }

    /**
     * 获取信息
     * @param id
     * @return
     */
    public Car getOneCar(Integer id){
        return carDao.getOneCar(id);
    }

    /**
     * 修改信息
     * @param car
     */
    public void updateOneCar(Car car){
        carDao.updateOneCar(car);
    }
}
