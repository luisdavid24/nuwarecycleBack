package com.nuwarecycle.nuwarecycle.repositories;

import com.nuwarecycle.nuwarecycle.models.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Integer>{
}
