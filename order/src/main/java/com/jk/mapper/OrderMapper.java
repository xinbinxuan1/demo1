package com.jk.mapper;

import com.jk.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    Long findPagecount();

    List<Order> findPage(Integer currPage, Integer pageSize);

    void deleteOrder(String[] roderId);

    void insertOrder(Order order);

    void updateOrder(Order order);

    Order huixianOrder(Integer roderId);
}
