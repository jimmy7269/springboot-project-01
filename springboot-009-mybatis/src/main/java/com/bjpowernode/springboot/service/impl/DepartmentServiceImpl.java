package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.mapper.DepartmentMapper;
import com.bjpowernode.springboot.model.Department;
import com.bjpowernode.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired // 报错是因为DepartmentMapper类没有添加@Mapper注解，添加了注解后才会扫描DAO并放入spring容器中
    private DepartmentMapper departmentMapper;

    @Override
    public Department queryDepartmentByDeptNo(Integer deptno) {
        return departmentMapper.selectByPrimaryKey(deptno);
    }
}
