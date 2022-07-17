package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.User;

import java.util.HashMap;

public interface UserService {
    Integer mysqlInsert(User user);

    User mysqlSelect(Integer id);

    Object redisHset(String key, String field, String value);


    Object redisHgetall(String key);
}
