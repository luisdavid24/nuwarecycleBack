package com.nuwarecycle.nuwarecycle.services;
import com.nuwarecycle.nuwarecycle.models.Product;
import com.nuwarecycle.nuwarecycle.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductServiceImp implements ProductService{
    private final ProductRepository productRepo;
    @Override
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }
}
