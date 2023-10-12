package com.nuwarecycle.nuwarecycle.services;

import com.nuwarecycle.nuwarecycle.models.User;
import com.nuwarecycle.nuwarecycle.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepo;

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

}
