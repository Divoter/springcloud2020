package com.divoter.springcloud.nacos.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.divoter.springcloud.nacos.payment.controller
 *
 * @author divoter
 * @date 2020/12/16 21:05
 */
@Slf4j
@RestController
@RequestMapping("/api/payment")
public class PaymenrtController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/{id}")
    public String getServerPort(@PathVariable String id){
        return "nacos \t 订单id： "+ id +"，提供方服务端口号："+serverPort;
    }
}
