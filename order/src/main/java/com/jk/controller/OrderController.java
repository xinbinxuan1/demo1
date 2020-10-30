package com.jk.controller;

import com.jk.entity.Order;
import com.jk.pojo.PageResult;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/orderList")
    public PageResult orderList(@RequestParam Integer currPage,@RequestParam Integer pageSize){
        return orderService.orderList(currPage,pageSize);
    }

    @RequestMapping("/deleteOrder")
    public void deleteOrder(@RequestBody String[] roderId){
        orderService.deleteOrder(roderId);
    }

    @RequestMapping("/insertOrder")
    public void insertOrder(@RequestBody Order order){
        orderService.insertOrder(order);
    }

    @RequestMapping("/huixianOrder")
    public Order huixianOrder(@RequestParam Integer roderId){
        return orderService.huixianOrder(roderId);
    }
}
