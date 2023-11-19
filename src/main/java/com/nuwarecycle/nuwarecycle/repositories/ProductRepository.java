package com.nuwarecycle.nuwarecycle.repositories;

import com.nuwarecycle.nuwarecycle.models.Product;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product, Integer> {
    List<Product> findByCategory(String category);

    List<Product> findByBrandIn(List<String> brands);
    
    List<Product> findByPriceIsBetween(int min, int max);

    Product findFirstByName(String name);
}
