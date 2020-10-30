package com.jk.controller;

import com.jk.entity.Order;
import com.jk.pojo.PageResult;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/orderList")
    public PageResult orderList(Integer currPage,Integer pageSize){
        return orderService.orderList(currPage,pageSize);
    }

    @RequestMapping("/deleteOrder")
    public void deleteOrder(String[] roderId){
        orderService.deleteOrder(roderId);
    }

    @RequestMapping("/insertOrder")
    public void insertOrder(Order order){
        orderService.insertOrder(order);
    }

    @RequestMapping("/huixianOrder")
    public Order huixianOrder(Integer roderId){
        return orderService.huixianOrder(roderId);
    }
}
