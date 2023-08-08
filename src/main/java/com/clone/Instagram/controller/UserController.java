package com.clone.Instagram.controller;

import com.clone.Instagram.model.User;
import com.clone.Instagram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){

       User savedUser = userRepository.insert(user);
       return ResponseEntity.ok(savedUser);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user){

        User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){

        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){

        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}
