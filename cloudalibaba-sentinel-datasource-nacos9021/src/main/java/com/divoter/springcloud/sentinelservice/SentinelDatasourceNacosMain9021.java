package com.divoter.springcloud.sentinelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelDatasourceNacosMain9021 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelDatasourceNacosMain9021.class, args);
    }
}
