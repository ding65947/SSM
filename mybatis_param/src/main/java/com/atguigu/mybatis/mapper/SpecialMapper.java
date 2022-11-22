package com.atguigu.mybatis.mapper;/**
 * @author DingDi
 * @create 2022-09-28 17:32
 */

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author: dingdi
 * @date: 2022/9/28 17:32
 */
public interface SpecialMapper {

    /**
     * 通过用户名模糊查询用户信息
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);


    /**
     * 批量删除
     * @param ids
     */
    void deleteMoreUser(@Param("ids") String ids);

    /**
     * 动态设置表名，查询用户信息
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);


    /**
     * 添加用户信息并获取自增的主键
     * @param user
     */
    void insertUser(User user);
}
