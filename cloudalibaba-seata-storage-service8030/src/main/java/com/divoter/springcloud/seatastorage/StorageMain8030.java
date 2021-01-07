package com.divoter.springcloud.seatastorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * com.divoter.springcloud.seatastorage
 *
 * @author divoter
 * @date 2021/1/7 19:46
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StorageMain8030 {
    public static void main(String[] args) {
        SpringApplication.run(StorageMain8030.class , args);
    }
}
