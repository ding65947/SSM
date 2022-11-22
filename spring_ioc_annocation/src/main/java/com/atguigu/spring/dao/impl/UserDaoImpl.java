package com.atguigu.spring.dao.impl;/**
 * @author DingDi
 * @create 2022-10-03 15:56
 */

import com.atguigu.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 *
 * @author: dingdi
 * @date: 2022/10/3 15:56
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void savaUser() {
        System.out.println("保存成功");
    }
}
