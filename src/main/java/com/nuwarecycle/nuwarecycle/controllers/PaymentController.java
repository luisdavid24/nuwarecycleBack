package com.nuwarecycle.nuwarecycle.controllers;
import com.nuwarecycle.nuwarecycle.models.Payment;
import com.nuwarecycle.nuwarecycle.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/payment")
public class PaymentController {
    private final PaymentService paymentService;
    @GetMapping("")
    public List<Payment> getAllPayments(){
        return  paymentService.getAllPayments();
    }
}
