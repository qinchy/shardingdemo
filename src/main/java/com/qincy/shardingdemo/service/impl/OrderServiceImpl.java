package com.qincy.shardingdemo.service.impl;

import com.qincy.shardingdemo.dao.OrderMapper;
import com.qincy.shardingdemo.model.Order;
import com.qincy.shardingdemo.model.OrderExample;
import com.qincy.shardingdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.sun.tools.doclint.Entity.or;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public String add() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId((long) i);
            order.setOrderId((long) i);
            orderMapper.insert(order);
        }
        for (int i = 10; i < 20; i++) {
            Order order = new Order();
            order.setUserId((long) i + 1);
            order.setOrderId((long) i);
            orderMapper.insert(order);
        }
        return "success";
    }

    @Override
    public List<Order> queryAll(OrderExample orderExample) {
        return orderMapper.selectByExample(orderExample);
    }
}
