package com.example.demo.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private final String name;
    private final String email;
    private final String phone;
    
    private Boolean enabled = false;
    @Column(unique = true, nullable = true)
    private String invitation = null;
}
