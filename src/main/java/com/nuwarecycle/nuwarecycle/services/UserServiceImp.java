package com.nuwarecycle.nuwarecycle.services;

import com.nuwarecycle.nuwarecycle.models.User;
import com.nuwarecycle.nuwarecycle.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
@AllArgsConstructor
@Service
public class UserServiceImp implements UserService{
    private final UserRepository userRepo;

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void createUser(User user) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        user.setRegistrationDate(LocalDateTime.of(date,time));
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userRepo.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findUserById(id);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteUserById(id);
    }
    @Override
    public void updateUser(User user){
        User existingUser = new User();
        User newUser = new User();
        existingUser = getUserById(existingUser.getId());
        existingUser.setUsername(newUser.getUsername());
        existingUser.setPassword(newUser.getPassword());
        existingUser.setProfileImg(newUser.getProfileImg());
        existingUser.setEmail(newUser.getEmail());
        userRepo.save(existingUser);
    }

}
