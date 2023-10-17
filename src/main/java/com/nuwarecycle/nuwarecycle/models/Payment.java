package com.nuwarecycle.nuwarecycle.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPayment;

    @OneToOne
    @JoinColumn(name = "orderDetail_id")
    private OrderDetail orderDetail;

    @Column(name = "payment_method", length = 100, nullable = false)
    private String PaymentMethod;

}
