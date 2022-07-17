package com.bjpowernode.springboot.interceptor;

import com.bjpowernode.springboot.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 定义一个用户拦截器 继承自HandlerInterceptor
public class UserInterceptor implements HandlerInterceptor {

    private String username;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 编写业务信息
        // 1. 从session中获取用户信息
       User user = (User) request.getSession().getAttribute("user");

       // 2. 判断用户是否登录
       if (null == user) {
           response.sendRedirect(request.getContextPath() + "/nologin");
           System.out.println("hot-fix test");
           return false;
       }
       return true;

       // return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
