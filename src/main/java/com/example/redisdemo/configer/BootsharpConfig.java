package com.example.redisdemo.configer;

import com.example.redisdemo.listener.TestListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootsharpConfig {

    @Bean(initMethod = "start",destroyMethod = "destory")
    public TestListener testListener(){
        return new TestListener();
    }


}
