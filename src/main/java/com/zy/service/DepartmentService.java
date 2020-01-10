package com.zy.service;

import com.zy.entity.Department;

import java.util.List;

public interface DepartmentService {
    /**
     * 获取部门列表
     * @return
     */
    List<Department> getDepartmentList();
}
