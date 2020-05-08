package com.springboot.demo.dao;

import com.springboot.demo.bean.CarImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 汽车图片持久层
 */
@Mapper
public interface CarImageDao {

    /**
     * 获取当前汽车的所有图片
     * @param ccarId
     * @return
     */
    List<CarImage> listAllCarImage(Integer ccarId);

    /**
     * 添加当前汽车
     * @param ccarId
     */
    void addCar(Integer ccarId);

    /**
     * 根据添加的查找最近添加的一个
     * @param ccarId
     * @return
     */
    CarImage findOneNew(Integer ccarId);

    /**
     * 删除图片
     * @param id
     */
    void deleteCarImage(Integer id);

    /**
     * 获取汽车图片的数量
     * @param ccarId
     * @return
     */
    Integer getCountCarImage(Integer ccarId);
}
