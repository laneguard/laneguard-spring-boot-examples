package com.macro.mall.tiny.component.threadPool;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * 线程配置属性类
 *
 * @Author gblfy
 * @Date 2022-04-05 17:20
 **/
@Data
@ConfigurationProperties(prefix = "task.pool")
@PropertySource("classpath:daoconfig/datasource-config.properties")
public class TaskThreadPoolConfig {
    private int corePoolSize;
    private int maxPoolSize;
    private int keepAliveSeconds;
    private int queueCapacity;
    private int awaitTerminationSeconds;
    private String threadNamePrefix;
}
