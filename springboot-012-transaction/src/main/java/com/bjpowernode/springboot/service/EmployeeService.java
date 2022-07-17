package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Employee;

public interface EmployeeService {
    int updateEmployeeByEmpNo(Employee employee);

    Employee queryEmployeeByEmpNo(Integer empno);
}
