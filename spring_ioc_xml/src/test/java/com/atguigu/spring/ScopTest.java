package com.atguigu.spring;/**
 * @author DingDi
 * @create 2022-10-02 15:45
 */

import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author: dingdi
 * @date: 2022/10/2 15:45
 */
public class ScopTest {
    @Test
    public void testScope(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-scop.xml");
        Student student1 = ioc.getBean(Student.class);
        Student student2 = ioc.getBean(Student.class);
        System.out.println(student1==student2);

    }
}
