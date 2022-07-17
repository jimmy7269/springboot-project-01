package com.bjpowernode.springboot;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot015JavaApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(Springboot015JavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        studentService.sayHello("继承自CommandLineRunner");
    }
}
