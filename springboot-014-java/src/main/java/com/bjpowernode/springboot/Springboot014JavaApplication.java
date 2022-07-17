package com.bjpowernode.springboot;

import com.bjpowernode.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot014JavaApplication {

	public static void main(String[] args) {
		/*
		 * springboot容器启动后，返回值是ConfigurableApplicationContext，他也是spring的一个容器，其实相当于原来spring容器中启动容器的ClasspathXmlApplicationContext
		 */
		// 获取spring容器
		ConfigurableApplicationContext applicationContext =  SpringApplication.run(Springboot014JavaApplication.class, args);
		// 获取spring容器中的方法
		StudentService studentService = (StudentService) applicationContext.getBean("studentServiceImpl");
		System.out.println(studentService.sayHello());
	}
}
