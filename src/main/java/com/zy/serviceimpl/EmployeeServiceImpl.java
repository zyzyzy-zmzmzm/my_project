package com.zy.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zy.dto.Page;
import com.zy.entity.Employee;
import com.zy.mapper.EmployeeMapper;
import com.zy.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getEmployeeList() {
        return employeeMapper.getEmployeeList();
    }

    @Override
    public Page<Employee> getEmployeePage(Integer pageNo,Integer pageSize) {
        Page<Employee> page = new Page<>();
        PageHelper.startPage(pageNo,pageSize);
        List<Employee> list = employeeMapper.getEmployeeList();
        PageInfo<Employee> info = new PageInfo<>(list);
        page.setPageCount(info.getPages());
        page.setPage(info.getList());
        page.setHasPre(info.isHasPreviousPage());
        page.setHasNext(info.isHasNextPage());
        return page;
    }

    @Override
    public void addEmployee(Employee employee) {

        employeeMapper.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(Integer empId) {
        employeeMapper.deleteEmployee(empId);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }
}
