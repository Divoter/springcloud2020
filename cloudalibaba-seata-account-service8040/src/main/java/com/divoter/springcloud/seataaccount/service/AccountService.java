package com.divoter.springcloud.seataaccount.service;

import java.math.BigDecimal;

/**
 * com.divoter.springcloud.seataaccount.service
 *
 * @author divoter
 * @date 2021/1/7 20:27
 */
public interface AccountService {
    int decrease(Long userId, BigDecimal money);
}
