package com.divoter.springcloud.seataorder.controller;

import com.divoter.springcloud.model.Order;
import com.divoter.springcloud.result.Result;
import com.divoter.springcloud.seataorder.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.divoter.springcloud.seataorder.controller
 *
 * @author divoter
 * @date 2020/12/24 22:00
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public Result create(Order order) {
        orderService.create(order);
        return Result.success("订单创建成功");
    }

}
