package com.divoter.springcloud.sentinel.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.divoter.springcloud.result.Result;

public class CustomerBlockExceptionHandler {

    public static Result rateHandler(BlockException exception){
        return Result.fail("流控限制，服务不可用----1");
    }

    public static Result rateHandler2(BlockException exception){
        return Result.fail("流控限制，服务不可用----2");
    }
}
