package com.nuwarecycle.nuwarecycle.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
public class User {

    private int idUser;

    private String name;

    private String lastname;

    private String email;

    private String password;

    private String role;

    private Date creationDate;


}
