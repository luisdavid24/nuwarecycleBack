package com.nuwarecycle.nuwarecycle.services;
import java.util.List;
import java.util.Optional;

import com.nuwarecycle.nuwarecycle.models.User;

public interface UserService {
    List<User> getAllUsers();
    void createUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);

    Optional<User> findOneByEmail(String email);
    void updateUser(User user);
}
