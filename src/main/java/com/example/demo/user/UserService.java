package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @SuppressWarnings("null")
    public void insertUser(User user) {
        this.userRepository.save(user);
    }

    public Optional<User> selectUser(String invitation) {
        return this.userRepository.findByInvitation(invitation);
    }
}
