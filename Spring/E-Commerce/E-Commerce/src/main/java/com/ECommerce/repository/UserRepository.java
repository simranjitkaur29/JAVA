package com.ECommerce.repository;

import com.ECommerce.Model.User.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {


}
