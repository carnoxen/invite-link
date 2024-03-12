package com.example.demo.user;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public Optional<User> findByInvitation(String invitation);
}
