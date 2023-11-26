package com.nuwarecycle.nuwarecycle.services;

import com.nuwarecycle.nuwarecycle.models.LikedProduct;
import com.nuwarecycle.nuwarecycle.models.Product;


import java.util.List;


public interface LikedProductService {
    void likeProduct(LikedProduct likedProduct);
    List<LikedProduct> getLikedProductsByUserId(int userId);
    //boolean existsByUserIdAndProductId(int userId, int productId);
}
