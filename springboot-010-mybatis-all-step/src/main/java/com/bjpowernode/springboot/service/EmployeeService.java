package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Employee;

public interface EmployeeService {
    Employee queryEmployeeByEmpno(Integer empno);
}
