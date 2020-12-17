package com.zht.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NacosProviderApi {

    @GetMapping(value = "/providerCar")
    public String providerCar(){
        return "生产了一辆车！";
    }

}
