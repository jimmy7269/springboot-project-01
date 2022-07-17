package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.bjpowernode.springboot.mapper")
public class Springboot012TransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot012TransactionApplication.class, args);
    }

}
