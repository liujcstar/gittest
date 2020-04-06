package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.Provider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/consumer")
public class Consumer {

    //根据接口类型动态生成代理对象,由代理对象获取生产者数据
    @Reference
    private Provider service;

    @RequestMapping("/hello")
    @ResponseBody
    public String getName(String name){
        //远程调用
        String result = service.sayHello(name);
        System.out.println(result);
        return result;
    }
}
