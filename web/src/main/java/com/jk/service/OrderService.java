package com.jk.service;

import com.jk.entity.Order;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order")
public interface OrderService {

    @RequestMapping("/orderList")
    public PageResult orderList(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    @RequestMapping("/deleteOrder")
    public void deleteOrder(@RequestBody String[] roderId);

    @RequestMapping("/insertOrder")
    public void insertOrder(@RequestBody Order order);

    @RequestMapping("/huixianOrder")
    public Order huixianOrder(@RequestParam Integer roderId);
}
