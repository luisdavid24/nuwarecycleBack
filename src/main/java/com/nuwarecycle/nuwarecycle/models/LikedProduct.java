package com.nuwarecycle.nuwarecycle.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "liked_products")
@Data
public class LikedProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;
}
