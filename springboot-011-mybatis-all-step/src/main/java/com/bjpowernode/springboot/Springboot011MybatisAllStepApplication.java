package com.bjpowernode.springboot;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.bjpowernode.springboot.mapper")
public class Springboot011MybatisAllStepApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot011MybatisAllStepApplication.class, args);
    }

}
