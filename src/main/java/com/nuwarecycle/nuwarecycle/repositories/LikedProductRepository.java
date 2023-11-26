package com.nuwarecycle.nuwarecycle.repositories;

import com.nuwarecycle.nuwarecycle.models.LikedProduct;
import com.nuwarecycle.nuwarecycle.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikedProductRepository extends JpaRepository<LikedProduct, Integer> {
    List<LikedProduct> findLikedProductByUserId(int userId);

    boolean existsLikedProductByUserIdAndProductIdProd(Long id, int idProd);
}
