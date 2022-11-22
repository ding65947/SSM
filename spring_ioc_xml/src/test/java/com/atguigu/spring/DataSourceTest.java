package com.atguigu.spring;/**
 * @author DingDi
 * @create 2022-10-02 15:27
 */

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 *
 * @author: dingdi
 * @date: 2022/10/2 15:27
 */
public class DataSourceTest {

    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource datasource = ioc.getBean(DruidDataSource.class);
        System.out.println(datasource.getConnection());
    }
}
