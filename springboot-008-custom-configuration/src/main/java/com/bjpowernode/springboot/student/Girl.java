package com.bjpowernode.springboot.student;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// 交给spring容器
@Component
@ConfigurationProperties(prefix = "girl") // 加一个前缀，代表配置文件中的前缀 其实这就是个配置类
public class Girl {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
