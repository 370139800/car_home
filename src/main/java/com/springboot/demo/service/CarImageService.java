package com.springboot.demo.service;

import com.springboot.demo.bean.CarImage;
import com.springboot.demo.dao.CarImageDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarImageService {

    @Resource
    private CarImageDao carImageDao;

    /**
     * 获取当前汽车下的图片
     * @param ccarId
     * @return
     */
    public List<CarImage> listAllCarImage(Integer ccarId){
        return carImageDao.listAllCarImage(ccarId);
    }

    /**
     * 添加车图
     * 支持事务
     * 并且需要上锁
     * @param ccarId
     */
    @Transactional(propagation= Propagation.REQUIRED,rollbackForClassName="Exception")
    public CarImage addCar(Integer ccarId) {
        synchronized (this) {
            //先插入
            carImageDao.addCar(ccarId);
            if (false)   //处理事务 进行回滚
                throw new RuntimeException();
            //再查询插入的这条数据
            CarImage carImage = carImageDao.findOneNew(ccarId);
            return carImage;
        }
    }
    /**
     * 删除汽车图片
     * @param id
     */
    public void deleteCarImage(Integer id){
        carImageDao.deleteCarImage(id);
    }

    /**
     * 获取某一个汽车下汽车图片数量
     * @param ccarId
     * @return
     */
    public Integer getCountCarImage(Integer ccarId){
       return carImageDao.getCountCarImage(ccarId);
    }
}
