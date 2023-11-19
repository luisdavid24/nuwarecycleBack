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

    @Override
    public Product getProductById(int idProd) {
        return productRepo.findById(idProd).orElse(null);
    }

    @Override
    public Product getProductByName(String name) {
        return productRepo.findFirstByName(name);
    }

    @Override
    public void createProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void deleteProductById(int idProd) {
        if (productRepo.existsById(idProd)) {
            productRepo.deleteById(idProd);
        }
    }
    @Override
    public void updateProduct(Product product){
        Product existingProduct = new Product();
        Product newProduct = new Product();
        existingProduct = getProductById(existingProduct.getIdProd());
        existingProduct.setName(newProduct.getName());
        //existingProduct.setImage(newProduct.getImage());
        existingProduct.setPrice(newProduct.getPrice());
        existingProduct.setDescription(newProduct.getDescription());
        existingProduct.setStock(newProduct.getStock());
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepo.findByCategory(category);
    }

    @Override
    public List<Product> getProductsByBrands(List<String> brands) {
        return productRepo.findByBrandIn(brands);
    }

    @Override
    public List<Product> getProductsBetweenPrice(int min, int max) {
        return productRepo.findByPriceIsBetween(min,max);
    }


}
