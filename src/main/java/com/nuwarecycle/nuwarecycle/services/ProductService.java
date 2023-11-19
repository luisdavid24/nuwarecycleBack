package com.nuwarecycle.nuwarecycle.services;

import com.nuwarecycle.nuwarecycle.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(int idProd);

    Product getProductByName(String name);

    void createProduct(Product product);

    void deleteProductById(int idProd);

    void updateProduct(Product product);

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrands(List<String> brands);

    List<Product> getProductsBetweenPrice(int min, int max);
}
