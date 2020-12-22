package com.divoter.springcloud.orderribbon.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.divoter.springcloud.model.Payment;
import com.divoter.springcloud.result.Result;
import com.divoter.springcloud.result.ResultContant;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.payment}")
    private String serviceUrl;


    @GetMapping("/consumer/getPaymentById/{id}")
//    @SentinelResource(value = "fallback")//没有配置,返回给前端 错误页面
//    @SentinelResource(value = "fallback",fallback = "fallbackMethod")//fallback 相当于服务降级  只处理运行异常
    @SentinelResource(value = "fallback",blockHandler = "blockMethod") //fallback blockHandler 同时配置，blockHandler 优先级更高
    public Result getById(@PathVariable String id){
        int i = 0;
        try {
            i = Integer.parseInt(id);
        }catch (Exception e){
           throw new IllegalArgumentException("参数错误");
        }
        Result result = restTemplate.getForObject(serviceUrl + "/api/payment/getById/" + id, Result.class);
        if(null == result.getData()){
            throw  new NullPointerException("未找到相应数据");
        }
        return result;
    }

    public Result fallbackMethod(String id, Throwable throwable){
        return Result.result(ResultContant.ERROR.getCode(),"id:"+id+" \t ,fallbackMethod异常信息:"+throwable.getMessage(),"");
    }

    public Result blockMethod(@PathVariable String id, BlockException e){
        return Result.result(ResultContant.ERROR.getCode(),"id:"+id+" \t ,blockMethod异常信息:"+e.getMessage(),"");
    }

}
