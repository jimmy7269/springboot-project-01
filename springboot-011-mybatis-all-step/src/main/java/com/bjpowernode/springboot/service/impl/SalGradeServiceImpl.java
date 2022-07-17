package com.bjpowernode.springboot.service.impl;


import com.bjpowernode.springboot.mapper.SalaryMapper;
import com.bjpowernode.springboot.model.Salary;
import com.bjpowernode.springboot.service.SalGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalGradeServiceImpl implements SalGradeService {

    @Autowired
    private SalaryMapper salaryMapper;
    @Override
    public Salary selectSalGradeByGrade(Integer grade) {
        return salaryMapper.selectByPrimaryKey(grade);
    }
}
