package com.haier.textparsing.service.impl;

import com.haier.textparsing.mapper.OrderMapper;
import com.haier.textparsing.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void parseOrder() {

        //1.查询所有的order的list;

        //2.
    }
}
