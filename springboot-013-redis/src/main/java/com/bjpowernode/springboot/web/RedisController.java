package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.RedisService;
import com.bjpowernode.springboot.service.impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/put")
    public Object put(String key, String value) {
        redisService.put(key, value);
        return "Redis放入key:" + key + "，value: " + value;
    }

    @RequestMapping(value = "/get")
    public Object get(String key) {
        String value = redisService.get(key);
        return "获得key：" + key + "的值value: " + value;
    }

}
