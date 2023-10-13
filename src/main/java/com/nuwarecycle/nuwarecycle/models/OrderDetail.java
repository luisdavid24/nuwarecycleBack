package com.nuwarecycle.nuwarecycle.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "order_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @NonNull
    private Product product;

    @Column(name = "amount",nullable = false )
    @NonNull
    private int amount;

    @Column(name = "total_price", nullable = false)
    @NonNull
    private float price;

}
