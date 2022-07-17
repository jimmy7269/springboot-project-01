package com.bjpowernode.springboot.config;

import com.bjpowernode.springboot.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // 定义此类为配置类，(即相当于之前的xml文件)
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] addPathPatterns = {
                "/user/**"
        };

        String[] excludePathPatterns = {
                "/user/mysql/login"
        };

        // 添加自定义的拦截器 添加拦截的路径 添加排除拦截的路径
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
