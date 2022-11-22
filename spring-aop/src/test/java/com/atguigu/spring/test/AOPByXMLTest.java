package com.atguigu.spring.test;/**
 * @author DingDi
 * @create 2022-10-11 17:18
 */

import com.atguigu.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author: dingdi
 * @date: 2022/10/11 17:18
 */
public class AOPByXMLTest {
    @Test
    public void testAOPByXML(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,2);
    }
}
