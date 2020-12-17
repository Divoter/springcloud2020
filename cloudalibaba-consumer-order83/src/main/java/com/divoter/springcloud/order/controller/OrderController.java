package com.divoter.springcloud.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Value("${service-url.nacos-payment-service}")
    private String service;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getPaymentById/{id}")
    public String getPayment(@PathVariable String id){
        return restTemplate.getForObject(service+"/api/payment/"+id, String.class);
    }
}
