package com.divoter.springcloud.sentinel.controller;

import com.alibaba.csp.sentinel.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/limit")
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "--------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "--------testB";
    }


    @GetMapping("/testC")
    public String testC(){
        // 暂停一秒
        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        log.info("testC 测试 RT");
        return "--------testC";
    }

    @GetMapping("/testD")
    public String testD(){
        log.info("testD 测试 异常比例");
        int a = 1/0;
        return "--------testD";
    }

    @GetMapping("/testE")
    public String testE(){
        log.info("testE 测试 异常数");
        int a = 1/0;
        return "--------testE";
    }
}
