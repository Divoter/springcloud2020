package com.divoter.springcloud.payment.controller;

import com.divoter.springcloud.model.Payment;
import com.divoter.springcloud.payment.service.PaymentService;
import com.divoter.springcloud.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * com.divoter.springcloud.payment.controller
 *
 * @author divoter
 * @date 2020/12/1 20:17
 */
@RestController
@Slf4j
@RequestMapping("/api/PaymentController")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping
    public Result create(Payment payment){
        int result = paymentService.create(payment);
        log.info("插入数据：{}",result);
        if(result > 0){
            return Result.success(result);
        }
        return Result.fail();
    }

    @GetMapping("/{id}")
    public Result getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getById(id);
        log.info("查询数据：{}",payment);
        if(null == payment){
            return Result.fail();
        }
        return Result.success(payment);
    }
}
