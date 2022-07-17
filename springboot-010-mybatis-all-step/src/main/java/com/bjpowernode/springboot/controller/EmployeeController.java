package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.Employee;
import com.bjpowernode.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    // 注入service类
    @Autowired
    private EmployeeService employeeService;

    /**
     * 利用service类中的查询方法查询员工信息
     * @param empno 员工编号
     * @return 员工信息
     */
    @RequestMapping(value = "/employee")
    @ResponseBody
    public Employee queryEmployeeByEmpno(Integer empno) {
        Employee employee = employeeService.queryEmployeeByEmpno(empno);
        return employee;
    }
}
