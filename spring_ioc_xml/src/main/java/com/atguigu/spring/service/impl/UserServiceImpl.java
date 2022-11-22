package com.atguigu.spring.service.impl;/**
 * @author DingDi
 * @create 2022-10-02 17:40
 */

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;

/**
 *
 * @author: dingdi
 * @date: 2022/10/2 17:40
 */
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser() {
        userDao.saveUser();
    }

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
