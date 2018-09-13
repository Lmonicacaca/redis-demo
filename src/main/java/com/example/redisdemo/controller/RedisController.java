package com.example.redisdemo.controller;

import com.example.redisdemo.common.MyException;
import com.example.redisdemo.service.RedisTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/redis")
public class RedisController {
    Logger logger = LoggerFactory.getLogger(RedisController.class);

    @Autowired
    private RedisTestService redisTestService;
    /**
     * 发起/取消关注
     *
     * @return
     */
    @RequestMapping(value = "/action", method = RequestMethod.POST)
    @ResponseBody
    public Object follow(@RequestParam("content") String content){
        logger.info(content);
        try{
            Object o = redisTestService.testRedis(content);
            return o;
        }catch (MyException e){
            return e.getMessage();
        }
    }
}
