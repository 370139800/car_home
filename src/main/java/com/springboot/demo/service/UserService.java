package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.User;
import com.springboot.demo.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户业务层
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    /**
     * 查询分页用户信息
     * @param start
     * @param size
     * @param username 进行模糊查询
     * @return
     */
    public PageInfo<User> finAllUser( int start ,int size ,String username){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<User> users = userDao.findAllUser(username);  //查询所有用户
        PageInfo<User> pages = new PageInfo<>(users,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 获取用户
     * @param id
     * @return
     */
    public User findOneUser(Integer id){
        return userDao.findOneUser(id);
    }

    /**
     * x修改用户信息
     * @param user
     * @return
     */
    public void changeUserMsg(User user){
        userDao.updateUser(user);
    }

    /**
     * 删除指定id的用户
     * @param id
     */
    public  void removeUser(Integer id){
        userDao.deleteUser(id);
    }

    /**
     * 添加用户
     * @param user
     */
    public  void addUser(User user){
        userDao.insertUser(user);
    }

    /**
     * 通过用户名获取用户信息
     * @param username
     */
    public User getUserByUsername(String username)  {
        User user = userDao.getUserByUsername(username);
        return user;
    }

}
