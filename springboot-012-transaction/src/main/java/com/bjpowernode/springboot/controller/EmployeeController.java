package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.Employee;
import com.bjpowernode.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(Integer empno, String ename) {
        Employee employee = new Employee();
        employee.setEmpno(empno);
        employee.setEname(ename);
        int updateCount = employeeService.updateEmployeeByEmpNo(employee);
        return "修改学生编号为: " + empno + "。修改结果为: " + updateCount + employee.toString();
    }

    @RequestMapping(value = "/select")
    @ResponseBody
    public Object select(Integer empno) {
       Employee employee = employeeService.queryEmployeeByEmpNo(empno);
       return  employee;
    }
}
