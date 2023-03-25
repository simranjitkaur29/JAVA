package com.example.firstproject.repository;

import com.example.firstproject.Model.Product.Product;
import com.example.firstproject.Model.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {
    // findByid
    // findAll
    // save
    // delete
    // deleteAll

}
