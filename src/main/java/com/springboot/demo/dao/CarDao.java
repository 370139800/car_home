package com.springboot.demo.dao;

import com.springboot.demo.bean.Car;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 汽车持久层
 */
@Mapper
public interface CarDao {
    /**
     * 查找当前种类id下的所有汽车
     * @param ccategoryId
     * @return
     */
    List<Car> listAllCar(Integer ccategoryId);

    /**
     * 删除指定id汽车
     * @param id
     */
    void deleteOneCar(Integer id);

    /**
     * 添加一个汽车
     * @param car
     */
    void addOneCar(Car car);

    /**
     * 通过id获取一个车信息
     * @param id
     * @return
     */
    Car getOneCar(Integer id);

    /**
     * 修改汽车信息
     * @param car
     */
    void updateOneCar(Car car);

}
