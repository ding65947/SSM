package com.atguigu.mybatis.mapper;/**
 * @author DingDi
 * @create 2022-09-28 15:48
 */

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author: dingdi
 * @date: 2022/9/28 15:48
 */
public interface SelectMapper {
    /**
     * 通过Id查询用户
     * @param id
     * @return
     */
    User selectUserById(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询用户的总数量
     */
    Integer getCount();


    /**
     * 根据Id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息为map集合
     * 若查询的数据有多条时，并且要将每条数据转换为map集合
     * 此时有两种解决方案
     * 1、将mapper接口方法的返回值设置为泛型是map的list集合
     *    List<Map<String, Object>> getAllUserToMap();
     * 2、可以将每条数据转换的map集合放在一个大的map中，但必须通过@MapKey注解将查询的某个字段的值作为大的map
     *
     * @return
     */
//    List<Map<String, Object>> getAllUserToMap();
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
