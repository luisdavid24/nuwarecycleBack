package com.nuwarecycle.nuwarecycle.services;
import com.nuwarecycle.nuwarecycle.models.Order;
import com.nuwarecycle.nuwarecycle.models.Payment;
import com.nuwarecycle.nuwarecycle.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderServiceImp implements OrderService{
    private final OrderRepository orderRepo;
    @Override
    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }
}
