package com.order;

import com.order.server.OrderService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private OrderService orderService;

    @org.junit.Test
    public void test1(){
        Map<String,Object> params = new HashMap<String,Object>();
        System.out.println(orderService.searchOrder(params));
    }
}
