package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.mapper.EmployeeMapper;
import com.bjpowernode.springboot.model.Employee;
import com.bjpowernode.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // 自动注入DAO
    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * DAO层查询员工信息
     * @param empno 员工编号
     * @return 员工信息
     */
    @Override
    public Employee queryEmployeeByEmpno(Integer empno) {
        return employeeMapper.selectByPrimaryKey(empno);
    }
}
