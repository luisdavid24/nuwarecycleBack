package com.nuwarecycle.nuwarecycle.services;
import com.nuwarecycle.nuwarecycle.models.Order;
import com.nuwarecycle.nuwarecycle.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@Service
public class OrderServiceImp implements OrderService{
    private final OrderRepository orderRepo;
    @Override
    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

    @Override
    public void createOrder(Order order){
        LocalDate Orderdate = LocalDate.now();
        LocalTime Ordertime = LocalTime.now();
        order.setCreationDate(LocalDateTime.of(Orderdate,Ordertime));
        orderRepo.save(order);
    }

}
