package com.example.firstproject.repository;

import com.example.firstproject.Model.orders.cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<cart, Integer> {

}
