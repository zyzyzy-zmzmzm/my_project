package com.zy.mapper;

import com.zy.entity.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentMapperTest {
    @Resource
    private DepartmentMapper departmentMapper;

    /**
     * 查询部门列表
     * 测试
     */
    @Test
    public void getDepartmentList() {
        List<Department> list = departmentMapper.getDepartmentList();
        System.out.println(list);
    }

    /**
     * 根据部门id部门详情
     * 测试
     */
    @Test
    public void getDepartmentByDeptId(){
        Department department = departmentMapper.getDepartmentByDeptId(1000);
        System.out.println(department);
    }
}