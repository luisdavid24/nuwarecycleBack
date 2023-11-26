package com.nuwarecycle.nuwarecycle.controllers;

import com.nuwarecycle.nuwarecycle.models.LikedProduct;
import com.nuwarecycle.nuwarecycle.models.Product;
import com.nuwarecycle.nuwarecycle.services.LikedProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/likedProducts")
@AllArgsConstructor
public class LikedProductController {

    private final LikedProductService likedProductService;
    @GetMapping("/{userId}")
    public List<Product> getLikedProductsByUserId(@PathVariable int userId){
        List<LikedProduct> liked = likedProductService.getLikedProductsByUserId(userId);
        return liked.stream().map(LikedProduct::getProduct).toList();
    }

    @PostMapping("")
    public void likeProduct(@RequestBody LikedProduct likedProduct){
        likedProductService.likeProduct(likedProduct);
    }

}
