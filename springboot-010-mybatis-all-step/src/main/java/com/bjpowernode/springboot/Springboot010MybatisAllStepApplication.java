package com.bjpowernode.springboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.bjpowernode.springboot.mapper") //需要扫描的文件夹
public class Springboot010MybatisAllStepApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot010MybatisAllStepApplication.class, args);
    }

}
