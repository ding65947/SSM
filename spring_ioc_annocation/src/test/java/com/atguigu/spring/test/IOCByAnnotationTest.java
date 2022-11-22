package com.atguigu.spring.test;/**
 * @author DingDi
 * @create 2022-10-03 15:59
 */

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import com.atguigu.spring.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author: dingdi
 * @date: 2022/10/3 15:59
 */
public class IOCByAnnotationTest {

    //@Autowired:实现自动装配功能的注解
    //1、@Autowired能够标识的位置
    //a>标识在成员变量上，不需要设置成员变量的set方法
    //b>标识在Set方法上
    //c>标识在当前成员变量赋值的有参构造上
    //2、@Autowired注解的原理
    //a>默认通过byType的方式，在IOC容器中通过类型匹配某个bean为属性赋值
    //b>若有多个类型匹配的bean，此时会自动转换为byName的方式实现自动装配的效果
    //c>若byType和byName的方式都无法实现自动装配，即IOC容器中有多个类型匹配的bean,
    //  且这些bean的id和要赋值的属性的属性名都不一致，此时抛异常：NoUniqueBeanDefinitionException
    //d>此时可以在要赋值的属性上，添加一个注解@Qualifier
    //通过该注解的value属性值，指定某个bean的id，将这个bean为属性赋值

    @Test
    public void test(){

        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annocation.xml");
        UserController userController = ioc.getBean(UserController.class);
//        System.out.println(userController);
//        UserService userService = ioc.getBean(UserService.class);
//        System.out.println(userService);
//        UserDao userDao = ioc.getBean(UserDao.class);
//        System.out.println(userDao);
        userController.saveUser();
    }
}
