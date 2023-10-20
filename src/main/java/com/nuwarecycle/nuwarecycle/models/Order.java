package com.nuwarecycle.nuwarecycle.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name= "orderDetail_id")
    private OrderDetail orderDetail;


    @Column(name = "creationDate", length = 100, nullable = false)
    private Date creationDate;

    @Column(name = "shipment", length = 100, nullable = false)
    private Date shipment;

    @Column(name = "delivery", length = 100, nullable = false)
    private Date delivery;

    @Column(name = "status", length = 50, nullable = false)
    private  String status;

    public void setCreationDate(LocalDateTime of) {
    }
}