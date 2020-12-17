package com.zht.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>消费者控制器</p>
 *
 * @author: ZHT
 * @create: 2020-12-17 17:54
 **/
@RestController
public class ConsumerController {

    //生产者的ip和端口
    @Value("${provider.address}")
    private String provider;

    @GetMapping("/getCar")
    public String getCar() {
        RestTemplate template = new RestTemplate();
        //远程获取一辆车，生产者生产的
        String car = template.getForObject("http://" + provider + "/api/providerCar", String.class);
        return car;
    }
}
