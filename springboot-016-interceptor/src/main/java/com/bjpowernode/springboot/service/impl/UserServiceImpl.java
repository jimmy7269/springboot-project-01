package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.mapper.UserMapper;
import com.bjpowernode.springboot.model.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    // 注入DAO
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Integer mysqlInsert(User user) {
        int retValue = userMapper.insert(user);
        System.out.println("插入成功");
        return retValue;
    }

    @Override
    public User mysqlSelect(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public Object redisHset(String key, String field, String value) {
        redisTemplate.opsForHash().put(key, field, value);
        return "redis数据库放入数据，其中key: " + key + ", filed: " + field + ", value: " + value;
    }

    @Override
    public Object redisHgetall(String key) {
        Map hashMap = redisTemplate.opsForHash().entries(key);
        return hashMap;
    }
}
