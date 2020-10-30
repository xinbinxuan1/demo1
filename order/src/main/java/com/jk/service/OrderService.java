package com.jk.service;

import com.jk.entity.Order;
import com.jk.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

public interface OrderService {

    PageResult orderList(Integer currPage, Integer pageSize);

    void deleteOrder(String[] roderId);

    void insertOrder(Order order);

    Order huixianOrder(Integer roderId);
}
