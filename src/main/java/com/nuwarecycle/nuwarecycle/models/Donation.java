package com.nuwarecycle.nuwarecycle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "donations")
@Data
public class Donation {

    private int idDonation;

    private String DonationType;

    private float amount;
}
