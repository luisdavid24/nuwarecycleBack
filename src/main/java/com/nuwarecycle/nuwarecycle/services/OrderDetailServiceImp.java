package com.nuwarecycle.nuwarecycle.services;
import com.nuwarecycle.nuwarecycle.models.OrderDetail;
import com.nuwarecycle.nuwarecycle.repositories.OrderDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderDetailServiceImp implements OrderDetailService{
    private final OrderDetailRepository orderDetailRepo;

    @Override
    public List<OrderDetail> getAllOrderDetails(){
        return orderDetailRepo.findAll();
    }
}
