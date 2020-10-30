package com.jk.service;

import com.jk.entity.Order;
import com.jk.entity.StaffBean;
import com.jk.mapper.OrderMapper;
import com.jk.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public PageResult orderList(Integer currPage, Integer pageSize) {
        Long total = orderMapper.findPagecount();
        List<Order> list = orderMapper.findPage(currPage,pageSize);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, list, currPage, pageSize, totalPage);
    }

    @Override
    public void deleteOrder(String[] roderId) {
        orderMapper.deleteOrder(roderId);
    }

    @Override
    public void insertOrder(Order order) {
        if (order.getRoderId()==null){
            orderMapper.insertOrder(order);
        }else {
            orderMapper.updateOrder(order);
        }
    }

    @Override
    public Order huixianOrder(Integer roderId) {
        return orderMapper.huixianOrder(roderId);
    }
}
