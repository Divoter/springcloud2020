package com.divoter.springcloud.seataaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * com.divoter.springcloud.seataaccount
 *
 * @author divoter
 * @date 2021/1/7 20:23
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AccountMain8040 {
    public static void main(String[] args) {
        SpringApplication.run(AccountMain8040.class, args);
    }
}
