package com.example.redisdemo.configer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue(){
        //创建一个名为TestQueue的队列，生产者和消费者根据bindingkey来放入和获取某个队列中的消息
        return new Queue("TestQueue");
    }
}
