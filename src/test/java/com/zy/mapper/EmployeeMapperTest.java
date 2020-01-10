package com.zy.mapper;

import com.zy.entity.Department;
import com.zy.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeMapperTest {
    @Resource
    private EmployeeMapper employeeMapper;
    @Test
    public void getEmployeeByEmpId() {
        Employee employee = employeeMapper.getEmployeeByEmpId(1002);
        System.out.println(employee);

    }

    @Test
    public void updateEmployee() {
        Employee employee = new Employee();
        employee.setEmpId(1000);
        employee.setEmpName("古力娜扎");
        employee.setGender("女");
        employeeMapper.updateEmployee(employee);
        System.out.println("修改成功");
    }

    @Test
    public void addEmployee() {
        Employee employee = new Employee();
        Department department = new Department();
        department.setDeptId(1000);
        employee.setEmail("123@q.com");
        employee.setGender("女");
        employee.setEmpName("赵敏菲");
        employee.setPhone("7828389");
        employee.setHireDate(new Timestamp(new Date().getTime()));
        employee.setDepartment(department);
        employeeMapper.addEmployee(employee);
        System.out.println(employee);;
    }

    @Test
    public void deleteEmployee() {
        employeeMapper.deleteEmployee(1005);
        System.out.println("删除成功");
    }
}