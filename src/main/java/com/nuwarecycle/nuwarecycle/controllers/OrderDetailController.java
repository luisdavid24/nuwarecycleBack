package com.nuwarecycle.nuwarecycle.controllers;
import com.nuwarecycle.nuwarecycle.models.OrderDetail;
import com.nuwarecycle.nuwarecycle.services.OrderDetailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/orderDetails")
public class OrderDetailController {
    private final OrderDetailService orderDetailService;
    @GetMapping("")
    public List<OrderDetail> getAllOrderDetails(){
        return orderDetailService.getAllOrderDetails();
    }
}
