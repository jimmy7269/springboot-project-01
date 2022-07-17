package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.Salary;
import com.bjpowernode.springboot.service.SalGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SalGrade {

    @Autowired
    private SalGradeService salGradeService;

    @RequestMapping(value = "/salgrade")
    @ResponseBody
    public Object selectSalGradeByGrade(Integer grade) {
        Salary salary = salGradeService.selectSalGradeByGrade(grade);
        return salary;
    }
}
