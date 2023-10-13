package com.nuwarecycle.nuwarecycle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "orders")
@Data
public class Order {

    private int idOrder;

    private int user_id;

    private Date creationDate;

    private Date shipment;

    private Date delivery;

    private  String status;


}