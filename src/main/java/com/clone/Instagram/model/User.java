package com.clone.Instagram.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.ArrayList;

@Document("User")
public class User {
    @MongoId
    private String userId;
    private String userName;
    private String profilePicUrl;
    private String description;
    private ArrayList<User> followers;
    private ArrayList<User> following;
    private ArrayList<String> posts;
    private ArrayList<String> reels;


}
