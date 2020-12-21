package com.divoter.springcloud.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.divoter.springcloud.sentinel.myHandler.CustomerBlockExceptionHandler;
import com.divoter.springcloud.sentinel.result.Result;
import com.divoter.springcloud.sentinel.result.ResultContant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/ratelimit")
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public Result byResource(){
        // SentinelResource 中的value
        log.info("按照资源名称限流测试，ok");
        return Result.success("按照资源名称限流测试，ok");
    }

    public Result handleException(BlockException e){
        log.info("服务不可用");
        return Result.fail(e.getClass().getCanonicalName()+" \t 服务不可用！");
    }

    @GetMapping("/byUrl")
    @SentinelResource(value = "byUrl")
    public Result byUrl(){
        // GetMapping 中的 /api/ratelimit/byUrl
        log.info("按照资源url限流测试，ok");
        return Result.success("按照资源url限流测试，ok");
    }


    @GetMapping("/byCustomerHandler")
    @SentinelResource(value = "byCustomerHandler"
            ,blockHandlerClass = CustomerBlockExceptionHandler.class //自定义异常处理类
            ,blockHandler = "rateHandler" //自定义异常处理方法
    )
    public Result byCustomer(){
        // 自定义 异常处理
        log.info("异常处理，ok");
        return Result.success("异常处理，ok");
    }


}
