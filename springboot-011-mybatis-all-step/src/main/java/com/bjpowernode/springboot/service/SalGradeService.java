package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Salary;

public interface SalGradeService {
    Salary selectSalGradeByGrade(Integer grade);
}
