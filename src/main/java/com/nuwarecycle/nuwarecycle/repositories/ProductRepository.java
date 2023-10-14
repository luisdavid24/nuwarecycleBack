package com.nuwarecycle.nuwarecycle.repositories;

import com.nuwarecycle.nuwarecycle.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer> {
}
