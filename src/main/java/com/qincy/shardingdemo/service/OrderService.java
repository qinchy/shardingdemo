package com.qincy.shardingdemo.service;

import com.qincy.shardingdemo.model.Order;
import com.qincy.shardingdemo.model.OrderExample;

import java.util.List;

public interface OrderService {
    String add();
    List<Order> selectByExample(OrderExample orderExample);
}
