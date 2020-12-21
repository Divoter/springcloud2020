package com.divoter.springcloud.feign.controller;

import com.divoter.springcloud.feign.service.PaymentService;
import com.divoter.springcloud.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.divoter.springcloud.feign.controller
 *
 * @author divoter
 * @date 2020/12/21 20:48
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consummer/payment/getById/{id}")
    public Result getById(@PathVariable String id){
        return  paymentService.getById(id);
    }


}
