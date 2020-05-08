package com.springboot.demo.dao;


import com.springboot.demo.bean.ManagerUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerUserDao {

    /**
     * 通过用户名获取超级管理员用户信息
     * @param username
     * @return
     */
    ManagerUser getManagerUserByUsername(String username);

    /**
     * 修改超级管理员信息
     * @param user
     */
    void updateManagerUser(ManagerUser user);

    /**
     * 通过id查找管理员信息
     * @param id
     * @return
     */
    ManagerUser findOneManagerUser(Integer id);
}
