package com.atguigu.spring.aop.annotation;/**
 * @author DingDi
 * @create 2022-10-11 16:54
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author: dingdi
 * @date: 2022/10/11 16:54
 */

@Component
@Aspect
@Order(1)
public class ValidateAspect {
//    @Before("execution(* com.atguigu.spring.aop.annotation.CalculatorPureImpl.*(..))")
    @Before("com.atguigu.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }

}
