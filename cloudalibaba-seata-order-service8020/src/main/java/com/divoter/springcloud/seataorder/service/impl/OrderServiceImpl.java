package com.divoter.springcloud.seataorder.service.impl;

import com.divoter.springcloud.model.Order;
import com.divoter.springcloud.seataorder.dao.OrderDao;
import com.divoter.springcloud.seataorder.service.FeignServiceAccount;
import com.divoter.springcloud.seataorder.service.FeignServiceStorage;
import com.divoter.springcloud.seataorder.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * com.divoter.springcloud.seataorder.service.impl
 *
 * @author divoter
 * @date 2020/12/24 22:00
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private FeignServiceAccount feignServiceAccount;
    @Resource
    private FeignServiceStorage feignServiceStorage;


    @Override
    public void create(Order order) {
        //1、新建订单
        log.info("------>开始新建订单");
        orderDao.create(order);

        //2、扣减库存
        log.info("------>订单微服务开始调用库存，做扣减start");
        feignServiceStorage.decrease(order.getProductId(), order.getCount());
        log.info("------>订单微服务开始调用库存，做扣减end");

        //3、扣减账户
        log.info("------>订单微服务开始调用账户，做扣减start");
        feignServiceAccount.decrease(order.getUserId(), order.getMoney());
        log.info("------>订单微服务开始调用账户，做扣减end");

        //4、修改订单状态，从0到1，1代表已经完成
        log.info("------>修改订单状态start");
        orderDao.update(order.getUserId(), 0);
        log.info("------>修改订单状态end");

        log.info("------>下订单结束了，O(∩_∩)O哈哈~");
    }

    @Override
    public void update(Long userId, Integer status) {
    }
}
