package com.nuwarecycle.nuwarecycle.repositories;

import com.nuwarecycle.nuwarecycle.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Integer> {
}
