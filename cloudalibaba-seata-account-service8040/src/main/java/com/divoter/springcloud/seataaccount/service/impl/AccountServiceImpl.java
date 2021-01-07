package com.divoter.springcloud.seataaccount.service.impl;

import com.divoter.springcloud.seataaccount.dao.AccountDao;
import com.divoter.springcloud.seataaccount.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * com.divoter.springcloud.seataaccount.service.impl
 *
 * @author divoter
 * @date 2021/1/7 20:27
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;


    @Override
    public int decrease(Long userId, BigDecimal money) {
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return accountDao.decrease(userId, money);
    }
}
