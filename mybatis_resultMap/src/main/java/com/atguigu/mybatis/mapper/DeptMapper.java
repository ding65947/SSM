package com.atguigu.mybatis.mapper;/**
 * @author DingDi
 * @create 2022-09-29 10:50
 */

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author: dingdi
 * @date: 2022/9/29 10:50
 */
public interface DeptMapper {

    /**
     * 通过分步查询查询员工以及所对应的部门信息第二步
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 查询部门以及部门中的员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 分步查询部门以及部门中的员工信息第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);

}
