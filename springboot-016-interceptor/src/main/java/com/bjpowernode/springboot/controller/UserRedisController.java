package com.bjpowernode.springboot.controller;

import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/user/redis")
public class UserRedisController {

    @Autowired
    private UserService userService;


    // 往redis数据库中写hash数据
    @RequestMapping(value = "/hset")
    public Object redisHset(String key, String field, String value) {
        userService.redisHset(key, field, value);
        return "放入数据:" + key + field + value;
    }

    // 往redis数据库取key对应的value
    @RequestMapping(value = "/hgetall")
    public Object redisHget(String key) {
        return userService.redisHgetall(key);
    }

}
