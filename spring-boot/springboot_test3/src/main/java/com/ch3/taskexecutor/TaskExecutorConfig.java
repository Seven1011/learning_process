package com.ch3.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/*
    配置类
*/
@Configuration
@ComponentScan("com.ch3.taskexecutor")
@EnableAsync   //开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {

    /*
    配置类实现AsyncConfigurer接口并重写getAsyncExcutor方法，并返回一个ThreadPoolTaskExecutor，
    这样我们就获得了一个基于线程池TaskExcutor
    */
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
