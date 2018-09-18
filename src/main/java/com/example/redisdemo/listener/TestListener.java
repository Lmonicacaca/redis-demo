package com.example.redisdemo.listener;

import com.alibaba.fastjson.JSON;
import com.example.redisdemo.domain.entity.User;
import com.example.redisdemo.invoker.Dispatcher;
import com.example.redisdemo.invoker.Worker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

@RabbitListener(queues = "TestQueue")
public class TestListener {
    Logger logger  = LoggerFactory.getLogger(TestListener.class);

    private int workerCount = 100;
    private int cacheQueueCapital = 800;
    //员工名册
    private ExecutorService workerRegister;
    //任务分配者
    private Dispatcher dispatcher;
    //队列
    private LinkedBlockingQueue<User> queue;

    @RabbitHandler
    public void process(String userJson){
        try {
            User user = JSON.parseObject(userJson, User.class);
            dispatcher.doDispatcher(user);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void start() {
        //购买流水线
        queue = new LinkedBlockingQueue<User>(cacheQueueCapital);
        //招聘主管
        dispatcher = new Dispatcher(queue);
        //创建员工名册
        workerRegister = Executors.newFixedThreadPool(workerCount);//线程池
        //雇佣worker
        for(int i=0;i<workerCount;i++){
            Worker worker = new Worker(queue);
            worker.setDaemon(true);//设置线程为守护线程
            worker.setName("worker-thread-"+i);//为线程设置名字
            workerRegister.execute(worker);
        }
    }

    private void destory() {

    }
}
