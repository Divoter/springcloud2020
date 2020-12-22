package com.divoter.springcloud.sentinelservice.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.divoter.springcloud.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getport")
    @SentinelResource(value = "getport", blockHandler = "blockExceptionHandler",fallback = "fallbackMethod")
    public Result getServerPort(){
        return Result.success(serverPort);
    }

    public Result blockExceptionHandler(BlockException e){
        return Result.fail("blockHandler: \t "+e.getMessage());
    }

    public Result fallbackMethod(Throwable e){
        return Result.fail("fallback: \t "+e.getMessage());
    }


}
