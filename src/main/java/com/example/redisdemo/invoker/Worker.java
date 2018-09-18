package com.example.redisdemo.invoker;

import com.alibaba.fastjson.JSONObject;
import com.example.redisdemo.domain.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.LinkedBlockingQueue;

public class Worker extends Thread{
    Logger logger  = LoggerFactory.getLogger(Worker.class);
    private LinkedBlockingQueue<User> queue;
    public Worker(LinkedBlockingQueue<User> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                User take = queue.take();
                System.out.println(JSONObject.toJSONString(take));
                logger.info("msg:" + take + "已被" + this.getName() + "接管");
                logger.info("信息为：" + JSONObject.toJSONString(take));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
