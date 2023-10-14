package com.nuwarecycle.nuwarecycle.services;
import com.nuwarecycle.nuwarecycle.models.Payment;
import com.nuwarecycle.nuwarecycle.repositories.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PaymentServiceImp implements PaymentService{
    private final PaymentRepository paymentRepo;
    @Override
    public List<Payment> getAllPayments(){
        return paymentRepo.findAll();
    }
}
