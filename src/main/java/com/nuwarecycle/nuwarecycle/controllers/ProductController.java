package com.nuwarecycle.nuwarecycle.controllers;
import com.nuwarecycle.nuwarecycle.models.Product;
import com.nuwarecycle.nuwarecycle.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/products")
@CrossOrigin("*")
public class ProductController {
    private final ProductService productService;

    @GetMapping("")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("")
    public void addProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    //ESTE METODO ESTÁ MAL HECHO, LUEGO LO CORRIJO
    @DeleteMapping("/{idProd}")
    public void deleteProduct(@RequestBody Product product){
        int idProd = product.getIdProd();
        productService.deleteProductById(idProd);
    }


    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable String categoryId) {
        return productService.getProductsByCategory(categoryId);
    }

    @GetMapping("/price")
    public List<Product> getProductsBetweenPrice(
            @RequestParam("min") int min,
            @RequestParam("max") int max
    ){
        return productService.getProductsBetweenPrice(min, max);
    }

    @GetMapping("/brand")
    public List<Product> getProductsByBrands(@RequestParam("brands") List<String> brands){
        return productService.getProductsByBrands(brands);
    }
}
