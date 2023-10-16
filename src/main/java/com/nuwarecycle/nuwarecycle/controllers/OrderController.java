package com.nuwarecycle.nuwarecycle.controllers;
import com.nuwarecycle.nuwarecycle.models.Order;
import com.nuwarecycle.nuwarecycle.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("")
    public void createOrder(@RequestBody Order newOrder){
        orderService.createOrder(newOrder);
    }
}
