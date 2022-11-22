package com.atguigu.ssm.mapper;/**
 * @author DingDi
 * @create 2022-11-09 16:48
 */

import com.atguigu.ssm.pojo.Employee;

import java.util.List;

/**
 *
 * @author: dingdi
 * @date: 2022/11/9 16:48
 */
public interface EmployeeMapper {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}
