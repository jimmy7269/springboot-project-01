package com.bjpowernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // 开启springboot核心配置
public class Springboot002Application {
	// springboot项目代码必须放在application类所在的同级或下级目录
	public static void main(String[] args) {
		SpringApplication.run(Springboot002Application.class, args);
	}

}
