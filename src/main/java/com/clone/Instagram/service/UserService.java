package com.clone.Instagram.service;

import com.clone.Instagram.model.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User add(User user);
    User updateUser(User user);
    User deleteUser(User user);
    User getUser(User user);


}
