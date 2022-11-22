package com.atguigu.spring.aop.xml;/**
 * @author DingDi
 * @create 2022-10-11 16:54
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author: dingdi
 * @date: 2022/10/11 16:54
 */

@Component
public class ValidateAspect {

    public void beforMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }

}
