package com.atguigu.ssm.service;/**
 * @author DingDi
 * @create 2022-11-09 16:27
 */

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 *
 * @author: dingdi
 * @date: 2022/11/9 16:27
 */
public interface EmployeeService {

    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
