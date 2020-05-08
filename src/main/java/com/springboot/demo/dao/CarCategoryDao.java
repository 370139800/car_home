package com.springboot.demo.dao;

import com.springboot.demo.bean.CarCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarCategoryDao {

    /**
     * 通过父级id获取子分类
     * @param parentId
     * @return
     */
    List<CarCategory> listSecondCarCategory(Integer parentId);

    /**
     * 获取一级种类
     * @return
     */
    List<CarCategory> listStairCarCategory();

    /**
     * 添加汽车分类
     */
    void addCarCategory(CarCategory carCategory);

    /**
     * 删除汽车分类
     * @param id
     */
    void deleteCarCategory(Integer id);

    /**
     * 通过id修改汽车分类名
     * @param carCategory
     */
    void updateCarCategory(CarCategory carCategory);

    /**
     * 通过id获取汽车种类
     * @param id
     * @return
     */
    CarCategory getOneCarCategory(Integer id);
}
