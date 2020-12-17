package com.zht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * nacos 消费者启动类
 */
@SpringBootApplication
public class NacosConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApp.class, args);
    }
}
