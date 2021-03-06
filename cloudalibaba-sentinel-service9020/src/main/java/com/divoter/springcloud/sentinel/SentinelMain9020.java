package com.divoter.springcloud.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMain9020 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMain9020.class, args);
    }
}
