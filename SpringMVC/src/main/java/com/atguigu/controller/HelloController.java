package com.atguigu.controller;/**
 * @author DingDi
 * @create 2022-10-15 21:09
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author: dingdi
 * @date: 2022/10/15 21:09
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String protal(){
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
