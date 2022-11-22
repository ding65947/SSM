package com.atguigu.spring.controller;/**
 * @author DingDi
 * @create 2022-10-02 17:39
 */

import com.atguigu.spring.service.UserService;
import com.atguigu.spring.service.impl.UserServiceImpl;

/**
 *
 * @author: dingdi
 * @date: 2022/10/2 17:39
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public void saveUser(){
        userService.saveUser();
    }
}
