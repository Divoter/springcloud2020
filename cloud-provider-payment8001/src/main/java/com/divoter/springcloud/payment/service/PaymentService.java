package com.divoter.springcloud.payment.service;

import com.divoter.springcloud.payment.model.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * com.divoter.springcloud.payment.service
 *
 * @author divoter
 * @date 2020/12/1 20:14
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getById(@Param("id")Long id);
}
