package com.divoter.springcloud.feign.service;

import com.divoter.springcloud.result.Result;
import com.divoter.springcloud.result.ResultContant;
import org.springframework.stereotype.Component;

/**
 * com.divoter.springcloud.feign.service
 *
 * @author divoter
 * @date 2020/12/21 20:54
 */
@Component
public class PaymentServiceFallBack implements PaymentService{

    @Override
    public Result getById(String id) {
        return Result.result(ResultContant.ERROR.getCode(),"服务降级，----PaymentServiceFallBack","id:\t"+id);
    }
}
