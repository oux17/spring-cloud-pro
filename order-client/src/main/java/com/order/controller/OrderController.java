package com.order.controller;

import com.order.server.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/add")
    public String add(@RequestBody HashMap<String,Object> map, HttpServletRequest request) {
        System.out.println(request.getRequestURL());
        boolean flag = orderService.insertOrder(map);
        System.out.println(flag);
        return "success";
    }
}
