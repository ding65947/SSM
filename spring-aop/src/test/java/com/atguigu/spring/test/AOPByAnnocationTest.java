package com.atguigu.spring.test;/**
 * @author DingDi
 * @create 2022-10-11 15:06
 */

import com.atguigu.spring.aop.annotation.Calculator;
import com.atguigu.spring.aop.annotation.CalculatorPureImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author: dingdi
 * @date: 2022/10/11 15:06
 */
public class AOPByAnnocationTest {

    @Test
    public void testAOPByAnnotation(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(3,1);
    }
}
