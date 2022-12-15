package com.order.server.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.order.mapper.OrderMapper;
import com.order.server.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public PageInfo searchOrder(Map<String, Object> params){
        PageHelper.startPage(1,10);

        List<Map<String, String>> list = orderMapper.searchOrder(params);

        PageInfo page = new PageInfo(list);

        return page;
    }

    @Override
    public boolean insertOrder(Map<String, Object> params) {
        orderMapper.insertOrder(params);
        return true;
    }

}
