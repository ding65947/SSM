package com.atguigu.spring.service.impl;/**
 * @author DingDi
 * @create 2022-10-03 15:56
 */

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author: dingdi
 * @date: 2022/10/3 15:56
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public void savaUser() {
        userDao.savaUser();
    }
}
