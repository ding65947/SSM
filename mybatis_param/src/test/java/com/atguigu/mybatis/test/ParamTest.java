package com.atguigu.mybatis.test;/**
 * @author DingDi
 * @create 2022-09-28 11:18
 */

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

/**
 * mybatis获取参数的两种形式：#{}和${}
 * 1、 若mapper接口方法的参数为单个的字面量类型，
 *     此时可以通过#{}和${}以任意的内容获取参数数值，一定注意${}的单引号问题
 * 2、 若mapper接口方法的参数为多个的字面量类型，
 *     参数要为arg0,arg1...或param1,param2...
 * 3、 若mapper接口方法的参数为map集合类型的参数，
 *     只需要通过#{}和${}访问map集合的键获取相对应的值
 * 4（重要）、 若mapper接口方法的参数为实体类类型的参数，
 *     只需要通过#{}和${}访问实体类中放入属性名，就可以获取对应属性值
 * 5（重要）、 可以在mapper接口方法的参数上设置@param注解
 *     此时mybatis会将这些参数放在map中 param1,param2...或设置的注解获取
 * @author: dingdi
 * @date: 2022/9/28 11:18
 */
public class ParamTest {
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root = mapper.getUserByUsername("admin");
        System.out.println(root);
    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root = mapper.checkLogin("root","123");
        System.out.println(root);
    }


    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("username","admin");
        map.put("password","123456");

        User root = mapper.checkLoginByMao(map);
        System.out.println(root);
    }

    @Test
    public void testInserUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null,"ding","659475",23,"男","1330340192@qq.com");
        mapper.insertUser(user);
    }

    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("ding", "659475");
        System.out.println(user);
    }


}










