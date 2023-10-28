package com.nuwarecycle.nuwarecycle.services;

import com.nuwarecycle.nuwarecycle.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(int idProd);

    void deleteProductById(int idProd);

    void updateProduct(Product product);

    List<Product> getProductsByCategory(String category);
}
