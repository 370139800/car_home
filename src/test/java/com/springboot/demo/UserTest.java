package com.springboot.demo;

import com.springboot.demo.bean.User;
import com.springboot.demo.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserTest {
    @Resource
    private UserDao userDao;

    @Test
    public void getAllUser(){
        userDao.deleteUser(1);
    }

    @Test
    public void getUser(){
        User user = new User();
        user.setName("友达");
        user.setSex("1");
        user.setUsername("addmin");
        user.setPassword("123456132");
        userDao.insertUser(user);
    }
}
