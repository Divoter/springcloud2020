package com.divoter.springcloud.payment.service.impl;

import com.divoter.springcloud.model.Payment;
import com.divoter.springcloud.payment.mapper.PaymentMapper;
import com.divoter.springcloud.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * com.divoter.springcloud.payment.service.impl
 *
 * @author divoter
 * @date 2020/12/1 20:15
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentMapper.getById(id);
    }
}
