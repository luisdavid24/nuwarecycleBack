package com.nuwarecycle.nuwarecycle.services;
import com.nuwarecycle.nuwarecycle.models.Donation;
import com.nuwarecycle.nuwarecycle.repositories.DonationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DonationServiceImp implements DonationService{
    private final DonationRepository donationRepo;
    @Override
    public List<Donation> getAllDonations(){
        return donationRepo.findAll();
    }
}
