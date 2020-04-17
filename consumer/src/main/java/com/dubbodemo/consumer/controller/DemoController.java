package com.dubbodemo.consumer.controller;

import com.dubbodemo.interfaceservice.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference
    private DemoService demoService;

    @RequestMapping("say")
    public String say(){
        String res = demoService.sayHello("abc");
        System.out.println("say: " + res);
        return res;
    }

    @RequestMapping("add")
    public Double add(){
        double res = demoService.add(100D, 1365D, 763D);
        System.out.println("add: " + res);
        return res;
    }
    @RequestMapping("muit")
    public Double muit(){
        double res = demoService.muit(100D, 46D, 654D);
        System.out.println("muit: " + res);
        return res;
    }
}
