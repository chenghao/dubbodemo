package com.dubbodemo.provider;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class ProviderBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderBootstrap.class).run(args);
    }
}
