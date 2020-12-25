package com.divoter.springcloud.seataorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * com.divoter.springcloud.seataorder
 *
 * @author divoter
 * @date 2020/12/24 21:52
 */

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //取消数据源自动装配，使用自定义的配置，整合seata
public class OrderMain8020 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8020.class, args);
    }
}
