package com.nuwarecycle.nuwarecycle.controllers;
import com.nuwarecycle.nuwarecycle.models.Donation;
import com.nuwarecycle.nuwarecycle.services.DonationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/donations")
public class DonationController {
    private final DonationService donationService;
    @GetMapping("")
    public List<Donation> getAllDonations(){
        return donationService.getAllDonations();
    }
}
