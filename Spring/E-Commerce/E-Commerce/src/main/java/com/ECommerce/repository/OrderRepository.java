package com.ECommerce.repository;

import com.ECommerce.Model.Order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String> {
}
