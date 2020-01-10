package com.zy.controller;

import com.zy.dto.Page;
import com.zy.entity.Department;
import com.zy.entity.Employee;
import com.zy.service.DepartmentService;
import com.zy.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @Resource
    private DepartmentService departmentService;
    /**
     * 分页获取员工列表
     * @return
     */
    @ResponseBody
    @GetMapping("/showEmployeeList")
    public String showEmployeeList(Integer pageNo,Integer pageSize){
        Page<Employee> page = employeeService.getEmployeePage(1, 2);
        return page.toString();
    }

    @GetMapping("/show")
    public String show(Model model){
        List<Employee> list = employeeService.getEmployeeList();
        model.addAttribute("list",list);

        return "Employeelist";
    }
    @GetMapping("/jump")
    public String jump(Model model){
        List<Department> list = departmentService.getDepartmentList();
        model.addAttribute("list",list);
        return "addEmp";
    }

    /**
     * 添加员工
     * @param employee
     * @return
     */
    @GetMapping("/addEmployee")
    public String addEmployee(Employee employee){
        System.out.println("***************");
        employeeService.addEmployee(employee);

        return "redirect:/show";
    }

    /**
     * 删除员工
     * @param empId
     * @return
     */
    @GetMapping("/delete/{empId}")
    public String delete(@PathVariable("empId") Integer empId){
        System.out.println(empId);
        employeeService.deleteEmployee(empId);
        return "redirect:/show";
    }

    /**
     * 跳转到修改页面
     * @param empId
     * @param model
     * @return
     */
    @GetMapping("/jumpupdate/{empId}")
    public String jumpupdate(@PathVariable("empId") Integer empId,Model model){

    }

    /**
     * 更新员工
     * @param employee
     * @return
     */
    @GetMapping("/updateEmployee")
    public String updateEmployee(Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/show";
    }
}
