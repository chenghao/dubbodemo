package com.dubbodemo.provider.service;

import com.dubbodemo.interfaceservice.DemoService;
import org.apache.dubbo.config.annotation.Service;

import java.math.BigDecimal;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return name;
    }

    @Override
    public Double add(double... d) {
        BigDecimal bd = new BigDecimal(String.valueOf(BigDecimal.ZERO));
        for(double i : d){
            bd = bd.add(new BigDecimal(i));
        }
        return bd.doubleValue();
    }

    @Override
    public Double muit(double... d) {
        BigDecimal bd = new BigDecimal(String.valueOf(BigDecimal.ONE));
        for(double i : d){
            bd = bd.multiply(new BigDecimal(i));
        }
        return bd.doubleValue();
    }
}
