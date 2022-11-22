package com.atguigu.mybatis.mapper;/**
 * @author DingDi
 * @create 2022-09-28 11:12
 */

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 *
 * @author: dingdi
 * @date: 2022/9/28 11:12
 */
public interface UserMapper {

    /**
     * 通过用户名查找用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);


    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);

    /**
     * 验证登录
     * @param map
     * @return
     */
    User checkLoginByMao(Map<String,Object> map);


    /**
     * 添加用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     * 验证登录  使用@param注解
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);


}
