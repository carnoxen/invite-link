package com.example.demo.user;

import lombok.Data;

@Data
public class UserForm {
    private String name;
    private String email;
    private String phone;

    public User toUser() {
        return new User(name, email, phone);
    }
}
