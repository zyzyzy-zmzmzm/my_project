package com.zy.service;

import com.zy.dto.Page;
import com.zy.entity.Employee;

import java.util.List;

public interface EmployeeService  {
    /**
     * 查询员工列表
     * @return
     */
    List<Employee> getEmployeeList();

    /**
     * 分页查询
     * @return
     */
    Page<Employee> getEmployeePage(Integer pageNo,Integer pageSize);

    /**
     * 添加员工
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * 删除员工
     * @param empId
     */
    void deleteEmployee(Integer empId);
    /**
     * 修改员工信息
     * @param employee
     */
    void updateEmployee(Employee employee);
}
