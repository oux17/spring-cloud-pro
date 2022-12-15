package com.order.server;

import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface OrderService {

    public PageInfo searchOrder(Map<String, Object> params);

    boolean insertOrder(Map<String, Object> params);
}
