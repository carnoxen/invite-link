package com.example.demo.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;



@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public String postUser(@RequestBody UserForm userForm, @RequestBody String invitation) {
        User user = userForm.toUser();
        user.setInvitation(invitation);
        userService.insertUser(user);
        return "user inserted";
    }

    @GetMapping
    public String getUser(@RequestParam String invitation) {
        Optional<User> userOrElse = userService.selectUser(invitation);
        if (userOrElse.isPresent()) {
            User user = userOrElse.get();
            user.setEnabled(true);
            user.setInvitation(null);
            userService.insertUser(user);
        }
        return new String();
    }
    
    
}
