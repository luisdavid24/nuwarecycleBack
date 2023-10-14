package com.nuwarecycle.nuwarecycle.controllers;
import com.nuwarecycle.nuwarecycle.models.Product;
import com.nuwarecycle.nuwarecycle.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping("")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
