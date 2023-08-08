package com.clone.Instagram.service.serviceImpl;

import com.clone.Instagram.model.User;
import com.clone.Instagram.repository.UserRepository;
import com.clone.Instagram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(User user) {
        return null;
    }

    @Override
    public User getUser(User user) {
        return null;
    }
}
