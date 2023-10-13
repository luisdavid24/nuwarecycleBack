package com.nuwarecycle.nuwarecycle.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProd;

    @Column(name = "name", length = 150, nullable = false)
    @NonNull
    private String name;

    @Column(name = "description", length = 400, nullable = false)
    @NonNull
    private String description;

    @Column(name = "price")
    @NonNull
    private float price;

    @Column(name = "image", length = 100, nullable = false)
    @NonNull
    private String image;

    @Column(name = "category", length = 100, nullable = false)
    @NonNull
    private String category;

    @Column(name = "stock")
    @NonNull
    private int stock;
}