package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.mapper.EmployeeMapper;
import com.bjpowernode.springboot.model.Employee;
import com.bjpowernode.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional  // 添加事务注解
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public int updateEmployeeByEmpNo(Employee employee) {
        int i = employeeMapper.updateByPrimaryKeySelective(employee);
        int j = 10/0;
        return i;
    }

    @Override
    public Employee queryEmployeeByEmpNo(Integer empno) {
        return employeeMapper.selectByPrimaryKey(empno);
    }
}
