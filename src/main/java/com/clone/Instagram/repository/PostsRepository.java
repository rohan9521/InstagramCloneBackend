package com.clone.Instagram.repository;

import com.clone.Instagram.model.Posts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostsRepository extends MongoRepository<Posts,String> {
}
