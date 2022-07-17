package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.Department;
import com.bjpowernode.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/department")
    @ResponseBody
    public Object department(Integer deptno) {
        Department department = departmentService.queryDepartmentByDeptNo(deptno);
        return department;
    }
}
