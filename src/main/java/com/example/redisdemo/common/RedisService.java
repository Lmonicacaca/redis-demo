package com.example.redisdemo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
public class RedisService {

    private String lockUser;

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public void set(String key, Object val) {
        redisTemplate.opsForValue().set(key, val);
    }

    public void setTransactionTemplate(String key, Object val) {
        redisTemplate.opsForValue().set(key, val);
    }

    public void set(String key, Object val, long seconds) {
        redisTemplate.opsForValue().set(key, val, seconds, TimeUnit.SECONDS);
    }

    public void setMinutes(String key, Object val, long minutes) {
        redisTemplate.opsForValue().set(key, val, minutes, TimeUnit.MINUTES);
    }

    public void setObjByMinutesAndTransaction(String key, Object val, long minutes) {

        redisTemplate.opsForValue().set(key, val, minutes, TimeUnit.MINUTES);
    }
    public void setObjByMinutesAndTransaction(String key, Object val) {

        redisTemplate.opsForValue().set(key, val);
    }

    public void watchTransaction(String key){
        redisTemplate.watch(key);
    }

    public void multiTransaction(){
        redisTemplate.multi();
    }

    public List<Object> execTransaction(){
        return redisTemplate.exec();
    }



    public void delete(String key) {
        redisTemplate.opsForValue().getOperations().delete(key);
    }

    public void leftPush(String key,Object obj,long minutes){
        redisTemplate.opsForList().leftPush(key,obj);
        redisTemplate.expire(key,minutes,TimeUnit.MINUTES);
    }



    public void leftPushByTransaction(String key,Object obj,long minutes){
        redisTemplate.opsForList().leftPush(key,obj);
        redisTemplate.expire(key,minutes,TimeUnit.MINUTES);
    }

    public void leftPushByTransaction(String key,Object obj) {
        redisTemplate.opsForList().leftPush(key, obj);
    }
    public List<Object> rangByTransaction(String key, long start, long size) {
        return redisTemplate.opsForList().range(key,start,size);
    }
    public long sizeByTransaction(String key) {
        return redisTemplate.opsForList().size(key);
    }

    public Set keys(String key){
        return redisTemplate.keys(key);
    }

    public void setList(String key, long index, Object value,long minutes){
        redisTemplate.opsForList().set(key,index,value);
        redisTemplate.expire(key,minutes,TimeUnit.MINUTES);
    }

    public void setList(String key, long index, Object value){
        redisTemplate.opsForList().set(key,index,value);
    }

    public void remove(String key, long index, Object value){
        redisTemplate.opsForList().remove(key,index,value);
    }

    public boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }


}
