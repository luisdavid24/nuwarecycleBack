package com.nuwarecycle.nuwarecycle.repositories;
import com.nuwarecycle.nuwarecycle.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer>{

}
