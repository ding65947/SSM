package com.atguigu.spring.factory;/**
 * @author DingDi
 * @create 2022-10-02 17:27
 */

import com.atguigu.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 *
 * @author: dingdi
 * @date: 2022/10/2 17:27
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
