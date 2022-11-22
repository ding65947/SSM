package com.atguigu.spring.proxy;/**
 * @author DingDi
 * @create 2022-10-11 13:39
 */

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 *
 * @author: dingdi
 * @date: 2022/10/11 13:39
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        /**
         * ClassLoader loader:指定加载动态生成的代理类的类加载器
         * Class[] interfaces:获取目标对象实现的所有接口的class对象的数组
         * InvocationHandler h:设置代理类中的抽象方法如何重写
         */
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("日志，方法："+method.getName()+",参数；"+ Arrays.toString(args));
                    //proxy表示代理类，method表示要执行的方法，args表示要执行的方法到参数列表
                    result = method.invoke(target, args);
                    System.out.println("日志，方法："+method.getName()+",结果；"+ result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("日志，方法："+method.getName()+",异常；"+ e);
                } finally {
                    System.out.println("日志，方法："+method.getName()+",方法执行完毕");
                }
                return result;
            }
        };
        //通过jdk Proxy类来创建代理类
        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }

}
