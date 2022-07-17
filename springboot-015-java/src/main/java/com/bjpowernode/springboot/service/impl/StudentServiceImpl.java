package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void sayHello(String msg) {
        System.out.println(msg);
    }
}
