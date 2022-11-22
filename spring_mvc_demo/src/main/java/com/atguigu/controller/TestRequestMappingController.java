package com.atguigu.controller;/**
 * @author DingDi
 * @create 2022-10-16 10:59
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author: dingdi
 * @date: 2022/10/16 10:59
 * 1、 @RequestMapping注解标识的位置
 * @RequestMapping标识一个类：设置映射请求的请求路径的初始信息
 * @RequestMapping标识一个方法：设置映射请求的请求路径的具体信息
 * 2、@RequestMapping注解value属性
 * 作用：通过请求的请求路径匹配请求
 * value属性时数组类型，即当前浏览器所发送请求的请求路径匹配value属性中的任何一个值，
 * 则当前请求就会被注解所标识的方法进行处理
 * 3、@RequestMapping注解的method属性
 * 作用：通过请求的请求方式匹配请求
 * method属性是RequestMethod类型的数组,即当前浏览器所发送请求的请求方式匹配method属性中的
 * 任何一种请求方式，则当前请求就会被注解所标识的方法进行处理
 * 4、@RequestMapping注解的params属性
 * 作用：通过请求的请求参数匹配请求，即浏览器发送的请求的请求参数必须满足params属性的设置
 * params可以使用四种表达式
 * “param”:表示当前所匹配请求的请求参数中必须携带param参数
 * “!param”:表示当前所匹配请求的请求参数中一定不能携带param参数
 * “param=value”:表示当前所匹配请求的请求参数中必须携带param参数且值必须为value
 * “param!=value”:表示当前所匹配请求的请求参数中可以不携带param参数，若携带值一定不能是param
 * 5、 4、@RequestMapping注解的headers属性
 * 作用：通过请求的请求头信息匹配请求，即浏览器发送的请求的请求头信息必须满足heads属性的设置
 * 用法和paras属性相同
 * 6、SpringMVC支持ant风格的路径
 * 在@RequestMapping注解的value属性值中设置一些特殊字符
 * ？：表示任意的单个字符
 * *：表示任意的0个或多个字符
 * **：表示任意层数的任意目录
 * 注意：在使用**时，只能将**写在双斜线中，前后不能有任何的其他字符
 * 7、@RequestMapping注解使用路径中的占位符
 * 传统：/deleteUser?id=1
 * rest:/user/delete/1
 * 需要在@RequestMapping注解的value属性中所设置的路径中使用{xxx}的方式表示路径中的数据
 * 再通过@PathVariable注解，将占位符所标识的值和控制器方法的形参进行绑定
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    //此时控制器方法所匹配的请求路径为/test/hello
    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.POST,RequestMethod.GET}
//            headers = {"referer"}
            )
    public String hello(){
        return "success";
    }

    @RequestMapping("/a?a/test/ant")
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("username:"+username);
        System.out.println("id:"+id);
        return "success";
    }
}
