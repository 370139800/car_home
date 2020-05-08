package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.CarMark;
import com.springboot.demo.dao.CarMarkDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarMarkService {

    @Resource
    private CarMarkDao carMarkDao;

    /**
     * 获取所有汽车标志及来源
     * @param start
     * @param size
     * @return
     */
    public PageInfo<CarMark> findAllCarMark(int start , int size,String name){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<CarMark> carMarks = carMarkDao.findAllCarMark(name);
        PageInfo<CarMark> pages = new PageInfo<>(carMarks,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 通过id获取一个汽车标志信息
     * @param id
     * @return
     */
    public CarMark findOneCarMark(Integer id){
        return carMarkDao.findOne(id);
    }

    /**
     * 通过id进行删除信息
     * @param id
     */
    public void deleteOneCarMark(Integer id){
        carMarkDao.deleteOne(id);
    }

    /**
     * 修改汽车标志信息
     * @param carMark
     */
    public void updateOneCarMark(CarMark carMark){
        carMarkDao.update(carMark);
    }

    /**
     * 添加车标信息
     * @param carMark
     */
    public void addOneCarMark(CarMark carMark){
        carMarkDao.addOneCarMark(carMark);
    }
}
