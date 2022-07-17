package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.model.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController // RestController括号中的value是spring容器中bean的名称，并不是路径名，如果需要使用路径，那么需要添加RequestMapping
@RequestMapping(value = "/user/mysql")
public class UserMySQLController {
    @Autowired
    private UserService userService;

    // 使用mysql数据库插入数据
    @RequestMapping(value = "/insert")
    public Object mysqlInsert(User user) {
        Integer retValue = userService.mysqlInsert(user);
        return "插入用户：" + user;
    }

    // 使用mysql数据库查询数据
    @RequestMapping(value = "/select")
    public Object mysqlSelect(Integer id) {
        User user = userService.mysqlSelect(id);
        return "选择用户：" + user;
    }

    // 用户登录
    @RequestMapping(value = "/login")
    public Object login(HttpServletRequest request, Integer id) {
        User user = new User();
        user.setName("lisi");
        user.setAge(22);
        request.getSession().setAttribute("user", user);
        return "login SUCCESS";
    }

    // 用户中心，该请求需要用户登录之后才可以访问
    @RequestMapping(value = "/center")
    public Object center() {
        return "see center message";
    }
}
