package com.atguigu.spring.process;/**
 * @author DingDi
 * @create 2022-10-02 16:21
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author: dingdi
 * @date: 2022/10/2 16:21
 */
public class MyBeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //此方法在bean生命周期初始化之前执行
        System.out.println("MyBeanProcessor-->后置处理器postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //此方法在bean生命周期初始化之后执行
        System.out.println("MyBeanProcessor-->后置处理器postProcessAfterInitialization");
        return bean;
    }
}
