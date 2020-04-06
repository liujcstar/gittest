package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.Provider;

@Service
public class ProviderImpl implements Provider {
    @Override
    public String sayHello(String name) {
        return "Provider: " + name;
    }
}
