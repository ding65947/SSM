package com.atguigu.controller;/**
 * @author DingDi
 * @create 2022-10-31 15:52
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author: dingdi
 * @date: 2022/10/31 15:52
 */
@Controller
public class TestController {
    @RequestMapping("/test/hello")
    public String testHello(){
        return "success";
    }
}
