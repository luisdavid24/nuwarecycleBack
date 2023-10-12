package com.nuwarecycle.nuwarecycle.controller;


import com.nuwarecycle.nuwarecycle.dao.UsuarioDao;
import com.nuwarecycle.nuwarecycle.models.User;
import com.nuwarecycle.nuwarecycle.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/v1/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}