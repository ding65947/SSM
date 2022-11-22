package com.atguigu.spring.proxy;/**
 * @author DingDi
 * @create 2022-10-11 13:23
 */

/**
 * 静态代理
 * @author: dingdi
 * @date: 2022/10/11 13:23
 */
public class CalculatorStaticProxy implements Calculator{

    private CalculatorPureImpl target;

    public CalculatorStaticProxy(CalculatorPureImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("日志，方法：add,参数："+i+","+j);
        int result = target.add(i, j);
        System.out.println("日志，方法：add,结果："+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("日志，方法：sub,参数："+i+","+j);
        int result = target.sub(i, j);
        System.out.println("日志，方法：sub,结果："+result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("日志，方法：mul,参数："+i+","+j);
        int result = target.mul(i, j);
        System.out.println("日志，方法：mul,结果："+result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("日志，方法：div,参数："+i+","+j);
        int result = target.div(i, j);
        System.out.println("日志，方法：div,结果："+result);
        return result;
    }
}
