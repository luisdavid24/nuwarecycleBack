package com.nuwarecycle.nuwarecycle.repositories;
import com.nuwarecycle.nuwarecycle.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Integer>{
    User findUserById(Long id);
    void deleteUserById(Long id);

    Optional<User> findOneByEmail(String email);
}
