package com.nuwarecycle.nuwarecycle.services;

import com.nuwarecycle.nuwarecycle.models.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();

    void createOrder(Order order);
}
