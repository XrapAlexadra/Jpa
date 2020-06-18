package com.github.xrapalexandra.kr.dao;

import com.github.xrapalexandra.kr.model.Order;
import com.github.xrapalexandra.kr.model.Status;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderDao {

    Integer addOrder(Order order);

    void delOrder(Integer orderId);

    Page<Order> getAllOrders(int page, int number);

    List<Order> getUserOrders(Integer userId);

    void changeOrderStatus(Integer orderId, Status status);

    List<Order> getPaidOrders();

    Integer getPageCount(int number);
}
