package com.divoter.springcloud.seataaccount.controller;

import com.divoter.springcloud.result.Result;
import com.divoter.springcloud.seataaccount.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * com.divoter.springcloud.seataaccount.controller
 *
 * @author divoter
 * @date 2021/1/7 20:28
 */
@RestController
@RequestMapping("/api/account")
@Slf4j
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/decrease")
    public Result decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        if (log.isInfoEnabled()) {
            log.info("账户模块，账户减余额，用户id：[{}],消费[{}]元", userId, money);
        }
        int i = accountService.decrease(userId, money);
        if (i == 0) return Result.fail();
        return Result.success();
    }


}
