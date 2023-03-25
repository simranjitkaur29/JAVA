package com.ECommerce.repository;


import com.ECommerce.Model.Product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
    // findByid
    // findAll
    // save
    // delete
    // deleteAll

}
