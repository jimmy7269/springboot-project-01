package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjpowernode.springboot.mapper")
public class Springboot016InterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot016InterceptorApplication.class, args);
    }

}
