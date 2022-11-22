package com.atguigu.spring.controller;/**
 * @author DingDi
 * @create 2022-10-03 15:54
 */

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author: dingdi
 * @date: 2022/10/3 15:54
 */

@Controller
public class UserController {

    //@Autowired:实现自动装配功能的注解
    @Autowired
    private UserService userService;

    public void saveUser(){
        userService.savaUser();
    }
}
