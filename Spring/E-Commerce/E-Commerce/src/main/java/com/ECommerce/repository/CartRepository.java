package com.ECommerce.repository;

import com.ECommerce.Model.Cart.cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<cart,String> {

}
