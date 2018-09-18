package com.example.redisdemo.invoker;

import com.example.redisdemo.domain.entity.User;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 任务分发者，负责将接受到的消息
 */
public class Dispatcher {
    private LinkedBlockingQueue<User> queue;

    public Dispatcher(LinkedBlockingQueue<User> queue) {
        this.queue = queue;
    }

    public void doDispatcher(User user)throws InterruptedException{
        queue.put(user);
    }
}
