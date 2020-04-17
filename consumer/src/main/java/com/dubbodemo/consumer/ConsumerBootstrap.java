package com.dubbodemo.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "com.dubbodemo")
public class ConsumerBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerBootstrap.class).run(args);
    }
}
