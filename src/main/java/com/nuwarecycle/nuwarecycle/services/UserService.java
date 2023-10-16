package com.nuwarecycle.nuwarecycle.services;
import java.util.List;
import com.nuwarecycle.nuwarecycle.models.User;

public interface UserService {
    List<User> getAllUsers();
    void createUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);

    void updateUser(User user);
}
