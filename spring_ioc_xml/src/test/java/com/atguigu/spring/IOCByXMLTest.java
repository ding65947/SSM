package com.atguigu.spring;/**
 * @author DingDi
 * @create 2022-10-02 12:57
 */

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author: dingdi
 * @date: 2022/10/2 12:57
 */
public class IOCByXMLTest {
    @Test
    public void testIOC(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student student = (Student) ioc.getBean("studentOne");
//        Student student = ioc.getBean(Student.class);
//        Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
//        System.out.println(clazz);
        Student studentSix = ioc.getBean("studentSix", Student.class);
        System.out.println(studentSix);
    }
}
