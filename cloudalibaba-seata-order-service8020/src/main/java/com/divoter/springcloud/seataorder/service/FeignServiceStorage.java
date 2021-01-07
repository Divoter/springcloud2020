package com.divoter.springcloud.seataorder.service;

import com.divoter.springcloud.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * com.divoter.springcloud.seataorder.service
 *
 * @author divoter
 * @date 2020/12/24 22:15
 */
@FeignClient(value = "seata-storage-service")
public interface FeignServiceStorage {

    //扣库存
    @PostMapping(value = "/api/storage/decrease")
    Result decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
