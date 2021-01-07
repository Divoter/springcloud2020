package com.divoter.springcloud.seataorder.service;

import com.divoter.springcloud.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * com.divoter.springcloud.seataorder.service
 *
 * @author divoter
 * @date 2020/12/24 22:15
 */
@FeignClient(value = "seata-account-service")
public interface FeignServiceAccount {
    // 减余额
    @PostMapping(value = "/api/account/decrease")
    Result decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
