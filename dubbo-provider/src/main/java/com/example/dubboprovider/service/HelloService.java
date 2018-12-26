package com.example.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboapi.api.IHelloService;

/**
 * @author duwen
 * @className HelloService
 * @date 2018/12/26 16:24
 * @description
 */
@Service(version = "1.0.0")
public class HelloService implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
