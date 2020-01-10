package com.zy.service;

import com.zy.dto.Page;
import com.zy.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {
    @Resource
    private EmployeeService employeeService;
    @Test
    public void getEmployeeList() {
        List<Employee> list = employeeService.getEmployeeList();
        System.out.println(list);
    }

    @Test
    public void getEmployeePage() {
        Page<Employee> page = employeeService.getEmployeePage(1, 2);
        System.out.println(page);
    }
}