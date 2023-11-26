package com.nuwarecycle.nuwarecycle.services;

import com.nuwarecycle.nuwarecycle.models.LikedProduct;
import com.nuwarecycle.nuwarecycle.models.Product;
import com.nuwarecycle.nuwarecycle.repositories.LikedProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class LikedProductServiceImpl implements LikedProductService{

    private final LikedProductRepository likedProductRepository;
    @Override
    public void likeProduct(LikedProduct likedProduct) {
        if (likedProductRepository.existsLikedProductByUserIdAndProductIdProd(likedProduct.getUser().getId(), likedProduct.getProduct().getIdProd())){
            likedProductRepository.delete(likedProduct);
        }else {
            likedProductRepository.save(likedProduct);
        }
    }

    @Override
    public List<LikedProduct> getLikedProductsByUserId(int userId) {
        return likedProductRepository.findLikedProductByUserId(userId);
    }


}
