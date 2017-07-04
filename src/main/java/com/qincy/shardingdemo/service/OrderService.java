package com.qincy.shardingdemo.service;

import com.qincy.shardingdemo.model.Order;
import com.qincy.shardingdemo.model.OrderExample;

import java.util.List;

public interface OrderService {
    public String add();
    public List<Order> queryAll(OrderExample orderExample);
}
