package com.divoter.springcloud.seatastorage.controller;

import com.divoter.springcloud.result.Result;
import com.divoter.springcloud.seatastorage.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.divoter.springcloud.seatastorage.controller
 *
 * @author divoter
 * @date 2021/1/7 19:53
 */
@RestController
@RequestMapping("/api/storage")
@Slf4j
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping("/decrease")
    public Result decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        if (log.isInfoEnabled()) {
            log.info("库存模块，扣库存业务开始，产品id：[{}], 数量[{}]", productId, count);
        }
        int i = storageService.decrease(productId, count);
        if(i == 0){
            return  Result.fail();
        }
        return Result.success();
    }
}
