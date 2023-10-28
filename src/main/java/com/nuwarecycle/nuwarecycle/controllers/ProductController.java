package com.nuwarecycle.nuwarecycle.controllers;
import com.nuwarecycle.nuwarecycle.models.Product;
import com.nuwarecycle.nuwarecycle.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    //ESTE METODO ESTÁ MAL HECHO, LUEGO LO CORRIJO
    @DeleteMapping("/{idProd}")
    public void deleteProduct(@RequestBody Product product){
        int idProd = product.getIdProd();
        productService.deleteProductById(idProd);
    }

    @PutMapping("")
    public void updateProduct(@RequestBody Product updateProduct){productService.updateProduct(updateProduct);}

    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable String categoryId) {
        return productService.getProductsByCategory(categoryId);
    }
}
