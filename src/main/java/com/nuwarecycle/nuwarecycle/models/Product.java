package com.nuwarecycle.nuwarecycle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    private int id_prod;

    private String name;

    private String description;

    private float price;

    private String image;

    private String category;

    private int stock;

}
