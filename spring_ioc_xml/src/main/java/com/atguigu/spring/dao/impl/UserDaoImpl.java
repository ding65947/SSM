package com.atguigu.spring.dao.impl;/**
 * @author DingDi
 * @create 2022-10-02 17:41
 */

import com.atguigu.spring.dao.UserDao;

/**
 *
 * @author: dingdi
 * @date: 2022/10/2 17:41
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
