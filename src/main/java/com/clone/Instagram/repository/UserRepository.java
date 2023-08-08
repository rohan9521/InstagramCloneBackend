package com.clone.Instagram.repository;

import com.clone.Instagram.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
