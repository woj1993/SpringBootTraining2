package com.example.controller;

import com.example.repository.UserRepository;
import com.example.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }
}
