package com.atguigu.mybatis.utils;/**
 * @author DingDi
 * @create 2022-09-27 17:33
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author: dingdi
 * @date: 2022/9/27 17:33
 */
public class SqlSessionUtil {

    public static SqlSession getSqlSession() {
        SqlSession sqlSession=null;
        //获取核心配置文件的输入流
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取sqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //获取SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取sqlSession对象 true自动提交事务
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sqlSession;
    }
}
