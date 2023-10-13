package com.nuwarecycle.nuwarecycle.models;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 150, nullable = false)
    @NonNull
    private String username;

    @Column(name = "password", length = 100, nullable = false)
    @NonNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column(name = "email", length = 100, nullable = false)
    @NonNull
    private String email;

    @Column(name = "date")
    @NonNull
    private LocalDateTime registrationDate;

    @Column(name = "description", length = 400, nullable = false)
    @NonNull
    private String description;

    @Column(name = "user_img", length = 100, nullable = false)
    @NonNull
    private String profileImg;
}

//Eyy mani organiza pues esa mondá pero rápido vale, no te hagas pelar