package com.qincy.shardingdemo.controller;

import com.qincy.shardingdemo.model.OrderExample;
import com.qincy.shardingdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by administrator on 17/7/4.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/add")
    public Object add() {
        return orderService.add();
    }

    @RequestMapping("query")
    private Object queryAll() {
        OrderExample orderExample = new OrderExample();
        return orderService.queryAll(orderExample);
    }
}
