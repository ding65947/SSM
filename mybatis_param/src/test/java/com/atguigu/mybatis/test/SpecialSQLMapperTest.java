package com.atguigu.mybatis.test;/**
 * @author DingDi
 * @create 2022-09-28 17:37
 */

import com.atguigu.mybatis.mapper.SpecialMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 *
 * @author: dingdi
 * @date: 2022/9/28 17:37
 */
public class SpecialSQLMapperTest {

    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }


    @Test
    public void testDeleteMoreUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        mapper.deleteMoreUser("8,9,10,11,12");
    }


    @Test
    public void testGetUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        List<User> userList = mapper.getUserList("t_user");
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        User user = new User(null,"xiaoming","12345",23,"男","123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

}
