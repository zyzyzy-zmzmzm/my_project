package com.zy.serviceimpl;

import com.zy.entity.Department;
import com.zy.mapper.DepartmentMapper;
import com.zy.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;
    /**
     * 获取部门列表
     * @return
     */
    @Override
    public List<Department> getDepartmentList() {
        return departmentMapper.getDepartmentList();
    }
}
