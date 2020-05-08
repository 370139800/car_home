package com.springboot.demo.service;

import com.springboot.demo.bean.ManagerUser;
import com.springboot.demo.dao.ManagerUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 超级管理员业务层
 */
@Service
public class ManagerUserService {

    @Resource
    private ManagerUserDao managerUserDao;

    /**
     * 通过用户名获取超级管理员信息
     * @param username
     * @return
     */
    public ManagerUser getManagerUserByUsername(String username){
        return managerUserDao.getManagerUserByUsername(username);
    }

    /**
     * 修改超级管理员信息
     * @param user
     */
     public void updateManagerUser(ManagerUser user){
        managerUserDao.updateManagerUser(user);
    }

    /**
     * 通过id获取用户信息
     * @param id
     * @return
     */
    public ManagerUser findOneManagerUser(Integer id){
         return managerUserDao.findOneManagerUser(id);
    }
}
