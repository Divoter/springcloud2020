package com.divoter.springcloud.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigCilentMain9010 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCilentMain9010.class, args);
    }
}
