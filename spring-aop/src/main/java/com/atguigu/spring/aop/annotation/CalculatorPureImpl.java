package com.atguigu.spring.aop.annotation;/**
 * @author DingDi
 * @create 2022-10-03 18:20
 */

import org.springframework.stereotype.Component;

/**
 *
 * @author: dingdi
 * @date: 2022/10/3 18:20
 */

@Component
public class CalculatorPureImpl implements Calculator{
    @Override
    public int add(int i, int j) {
        int result = i+j;
        System.out.println("方法内部，result:"+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i-j;
        System.out.println("方法内部，result:"+result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i*j;
        System.out.println("方法内部，result:"+result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i/j;
        System.out.println("方法内部，result:"+result);
        return result;
    }
}
