package com.nuwarecycle.nuwarecycle.services;

import com.nuwarecycle.nuwarecycle.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(int idProd);

    boolean deleteProductById(int idProd);
}
