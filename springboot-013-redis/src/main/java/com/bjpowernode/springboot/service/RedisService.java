package com.bjpowernode.springboot.service;

public interface RedisService {
    void put(String key, String value);

    String get(String key);
}
