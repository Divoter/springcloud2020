package com.divoter.springcloud.feign.service;

import com.divoter.springcloud.result.Result;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * com.divoter.springcloud.feign.service
 *
 * @author divoter
 * @date 2020/12/21 20:48
 */
@FeignClient(value = "nacos-sentinel-payment-provider",fallback = PaymentServiceFallBack.class)
public interface PaymentService {

    @GetMapping("/api/payment/getById/{id}")
    public Result getById(@PathVariable("id") String id);
}
