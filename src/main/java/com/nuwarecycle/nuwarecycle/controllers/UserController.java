package com.nuwarecycle.nuwarecycle.controllers;

import com.nuwarecycle.nuwarecycle.models.User;
import com.nuwarecycle.nuwarecycle.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;
    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping("")
    public void createUser(@RequestBody User newUser){
        userService.createUser(newUser);
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody User updateUser){userService.updateUser(updateUser);}

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
