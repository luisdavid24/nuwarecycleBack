package com.nuwarecycle.nuwarecycle.services;
import com.nuwarecycle.nuwarecycle.models.OrderDetail;
import com.nuwarecycle.nuwarecycle.models.Product;
import com.nuwarecycle.nuwarecycle.repositories.OrderDetailRepository;
import com.nuwarecycle.nuwarecycle.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;
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

    @Override
    public void createOrderDetail(OrderDetail orderDetail){
        orderDetail = orderDetailRepo.save(orderDetail);
    }
}
