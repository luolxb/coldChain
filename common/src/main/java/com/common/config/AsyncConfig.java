package com.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {

    @Bean("taskExecutor")
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 设置核心线程数
        int cores = Runtime.getRuntime().availableProcessors();
        executor.setCorePoolSize(cores);
        // 设置最大线程数
        executor.setMaxPoolSize(20);
        // 等待所有任务结束后再关闭线程池
        executor.setWaitForTasksToCompleteOnShutdown(true);
        // 设置线程默认前缀名
        executor.setThreadNamePrefix("taskExecutor-Level-Async-");
        return executor;
    }

}
