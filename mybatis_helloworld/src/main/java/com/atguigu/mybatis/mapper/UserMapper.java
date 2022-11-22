package com.atguigu.mybatis.mapper;/**
 * @author DingDi
 * @create 2022-09-27 15:09
 */

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 *
 * @author: dingdi
 * @date: 2022/9/27 15:09
 */
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据id查询信息
     * @return
     */
    User getUserById();

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();

}
