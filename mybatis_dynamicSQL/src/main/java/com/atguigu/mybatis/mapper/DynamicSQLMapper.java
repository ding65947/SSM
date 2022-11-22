package com.atguigu.mybatis.mapper;/**
 * @author DingDi
 * @create 2022-09-30 10:14
 */

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author: dingdi
 * @date: 2022/9/30 10:14
 */
public interface DynamicSQLMapper {

    /**
     * 根据条件查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);


    /**
     * 使用choose查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);


    /**
     * 批量添加员工信息
     * @param emps
     */
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /**
     * 批量删除
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
