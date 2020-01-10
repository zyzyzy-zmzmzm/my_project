package com.zy.mapper;

import com.zy.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    /**
     * 根据员工id查员工信息
     * @param empId
     * @return
     */
    Employee getEmployeeByEmpId(Integer empId);

    /**
     * 查询员工列表
     * @return
     */
    List<Employee> getEmployeeList();

    /**
     * 修改员工信息
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 添加员工
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     *根据员工id删除
     * @param empId
     */
    void deleteEmployee(Integer empId);
}
