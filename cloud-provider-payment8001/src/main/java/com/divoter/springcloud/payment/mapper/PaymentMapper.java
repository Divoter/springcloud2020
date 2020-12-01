package com.divoter.springcloud.payment.mapper;

import com.divoter.springcloud.payment.model.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * com.divoter.springcloud.payment.mapper
 *
 * @author divoter
 * @date 2020/12/1 20:04
 */
@Mapper
public interface PaymentMapper {

    int create(Payment payment);

    Payment getById(@Param("id")Long id);

}
