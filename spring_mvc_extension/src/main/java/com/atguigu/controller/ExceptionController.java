package com.atguigu.controller;/**
 * @author DingDi
 * @create 2022-11-01 17:06
 */

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author: dingdi
 * @date: 2022/11/1 17:06
 */
//将当前类标注为异常处理组件
@ControllerAdvice
public class ExceptionController {
    //设置要处理的异常信息
    @ExceptionHandler(ArithmeticException.class)
    //ex表示控制器方法所出现的异常
    public String handelException(Throwable ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
