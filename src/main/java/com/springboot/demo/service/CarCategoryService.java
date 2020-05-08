package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.CarCategory;
import com.springboot.demo.dao.CarCategoryDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 汽车种类业务层
 */
@Service
public class CarCategoryService {

    @Resource
    private CarCategoryDao carCategoryDao;

    /**
     * 获取二级分类
     * @param parentId
     * @param start
     * @param size
     * @return
     */
    public PageInfo<CarCategory> listSecondCarCategory(Integer parentId,int start , int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<CarCategory> stairCarCategorys = carCategoryDao.listSecondCarCategory(parentId);
        PageInfo<CarCategory> pages = new PageInfo<>(stairCarCategorys,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 获取汽车一级分类
     * @param start
     * @param size
     * @return
     */
    public PageInfo<CarCategory> listStairCarCategory(int start , int size){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<CarCategory> stairCarCategorys = carCategoryDao.listStairCarCategory();
        PageInfo<CarCategory> pages = new PageInfo<>(stairCarCategorys,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 添加汽车种类
     * @param carCategory
     */
    public void addCarCategory(CarCategory carCategory){
        carCategoryDao.addCarCategory(carCategory);
    }

    /**
     * 删除某一个汽车种类
     * @param id
     */
    public void deleteCarCategory(Integer id){
        carCategoryDao.deleteCarCategory(id);
    }

    /**
     * 修改汽车种类信息
     * @param carCategory
     */
    public void updateCarCategory(CarCategory carCategory){
        carCategoryDao.updateCarCategory(carCategory);
    }

    /**
     * 通过id获取一个汽车种类
     * @param id
     * @return
     */
    public CarCategory getOneCarCategory(Integer id){
        return carCategoryDao.getOneCarCategory(id);
    }
}
