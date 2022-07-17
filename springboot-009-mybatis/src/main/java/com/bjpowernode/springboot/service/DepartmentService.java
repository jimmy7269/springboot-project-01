package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Department;

public interface DepartmentService {
    Department queryDepartmentByDeptNo(Integer deptno);
}
