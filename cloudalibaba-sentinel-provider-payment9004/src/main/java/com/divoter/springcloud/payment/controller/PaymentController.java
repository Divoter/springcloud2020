package com.divoter.springcloud.payment.controller;

import com.divoter.springcloud.model.Payment;
import com.divoter.springcloud.result.Result;
import com.divoter.springcloud.result.ResultContant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;

@RestController
@Slf4j
@RequestMapping("/api/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    // 模拟数据库数据
    public static ConcurrentHashMap<String, Payment> dbData= new ConcurrentHashMap<>();

    static {
        dbData.put("1",new Payment(1L,"111111111"));
        dbData.put("2",new Payment(2L,"222222222"));
        dbData.put("3",new Payment(3L,"333333333"));
    }

    @GetMapping("getById/{id}")
    public Result getById(@PathVariable String id){
        return
                Result.result(
                        ResultContant.SUCCESS.getCode(),
                        "server port : "+serverPort,
                        dbData.get(id)
                );
    }

}
