package com.zy.mapper;

import com.zy.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    /**
     * 获取部门列表
     * @return
     */
    List<Department> getDepartmentList();

    /**
     * 根据部门id查询部门详情
     * @param deptId
     * @return
     */
    Department getDepartmentByDeptId(Integer deptId);

}
