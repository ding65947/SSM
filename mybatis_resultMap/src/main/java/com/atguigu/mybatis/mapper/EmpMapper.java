package com.atguigu.mybatis.mapper;/**
 * @author DingDi
 * @create 2022-09-28 18:50
 */

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author: dingdi
 * @date: 2022/9/28 18:50
 */
public interface EmpMapper {

    /**
     * 根据id查询员工信息
     * @param empid
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empid);


    /**
     * 获取员工以及所对应的部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);


    /**
     * 通过分步查询查询员工以及所对应的部门信息的第一步
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 通过分布查询查询部门信息及所对应员工第二步
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptID") Integer deptId);

}
