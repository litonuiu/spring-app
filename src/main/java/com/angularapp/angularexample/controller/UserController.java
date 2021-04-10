package com.angularapp.angularexample.controller;

import com.angularapp.angularexample.entity.User;
import com.angularapp.angularexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Md. Liton Miah
 * @Date 3/26/2021
 */

@CrossOrigin(origins = "http://localhost:4401")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
