package com.springboot.demo.dao;

import com.springboot.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 获取所有用户
     * @return
     */
    List<User> findAllUser(@Param("username") String username);

    /**
     * 获取当前id下的用户信息
     * @param id
     * @return
     */
    User findOneUser(Integer id);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    void updateUser(User user);

    /**
     * 通过id删除用户
     * @param id
     */
    void deleteUser(Integer id);

    /**
     * 插入用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     * 通过用户名获取用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);

}
