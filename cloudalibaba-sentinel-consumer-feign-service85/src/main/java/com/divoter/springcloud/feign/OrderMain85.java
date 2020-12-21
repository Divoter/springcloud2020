package com.divoter.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * com.divoter.springcloud.feign
 *
 * @author divoter
 * @date 2020/12/21 20:45
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain85 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain85.class, args);
    }
}
