package com.divoter.springcloud.seataorder.service;

import com.divoter.springcloud.model.Order;
import org.apache.ibatis.annotations.Param;

/**
 * com.divoter.springcloud.seataorder.service
 *
 * @author divoter
 * @date 2020/12/24 22:00
 */
public interface OrderService {
    void create(Order order);
    void update(Long userId, Integer status);
}


