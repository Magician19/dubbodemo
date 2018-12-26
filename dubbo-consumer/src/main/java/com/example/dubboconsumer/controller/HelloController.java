package com.example.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboapi.api.IHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duwen
 * @className HelloController
 * @date 2018/12/26 16:26
 * @description
 */
@RestController
public class HelloController {

    @Reference(version = "1.0.0",url = "dubbo://10.100.18.206:12345")
    private IHelloService helloService;

    @GetMapping("/hello")
    public String hello(String name){
        return helloService.sayHello(name);
    }
}
