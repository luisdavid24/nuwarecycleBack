package com.nuwarecycle.nuwarecycle.repositories;

import com.nuwarecycle.nuwarecycle.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <Payment, Integer> {
}
