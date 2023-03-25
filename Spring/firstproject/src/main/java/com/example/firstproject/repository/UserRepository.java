package com.example.firstproject.repository;


import com.example.firstproject.Model.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository  extends MongoRepository<User,Integer> {
    List<User> findAll();
    User save(User user);
    User insert(User user);

   // User findById(Integer id);



}