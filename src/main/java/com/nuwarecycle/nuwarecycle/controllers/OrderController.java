package com.nuwarecycle.nuwarecycle.controllers;
import com.nuwarecycle.nuwarecycle.models.Order;
import com.nuwarecycle.nuwarecycle.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
}
