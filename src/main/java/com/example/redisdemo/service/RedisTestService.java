package com.example.redisdemo.service;

import com.example.redisdemo.common.MyException;

public interface RedisTestService {
    public Object testRedis(String content)throws MyException;
}
