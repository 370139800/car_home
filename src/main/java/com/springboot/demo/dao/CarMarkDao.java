package com.springboot.demo.dao;

import com.springboot.demo.bean.CarMark;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 汽车标志持久层
 */
@Mapper
public interface CarMarkDao {

    /**
     * 获取所有汽车标志,以及来源
     * @return
     */
    public List<CarMark> findAllCarMark(@Param("name") String name);

    /**
     * 获取一个汽车标志,通过id
     * @return
     */
    public CarMark findOne(Integer id);

    /**
     * 通过id进行删除对应信息
     * @param id
     */
    public void deleteOne(Integer id);

    /**
     * 修改汽车标志信息
     * @param carMark
     */
    public void update(CarMark carMark);

    /**
     * 添加汽车标志信息
     * @param carMark
     */
    public void addOneCarMark(CarMark carMark);
}
