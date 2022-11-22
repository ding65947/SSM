package com.atguigu.proxy;/**
 * @author DingDi
 * @create 2022-10-11 13:33
 */

import com.atguigu.spring.proxy.Calculator;
import com.atguigu.spring.proxy.CalculatorPureImpl;
import com.atguigu.spring.proxy.CalculatorStaticProxy;
import com.atguigu.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 *
 * @author: dingdi
 * @date: 2022/10/11 13:33
 */
public class ProxyTest {

    @Test
    public void testProxy(){
        /**
         * 动态代理两种:
         * 1、jdk动态代理，要求必须有接口，最终生成的代理类和目标类实现相同的接口，在com.sun.proxy包下，类名为$proxy2
         * 2、cglib动态代理,最终生成的代理类会继承目标类，并且和目标类在相同的包下
         */

//        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorPureImpl());
//        proxy.add(1,2);

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorPureImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.div(1,1);


    }
}
