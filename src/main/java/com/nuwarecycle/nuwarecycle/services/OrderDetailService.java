package com.nuwarecycle.nuwarecycle.services;

import com.nuwarecycle.nuwarecycle.models.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> getAllOrderDetails();

    void createOrderDetail(OrderDetail orderDetail);
}
