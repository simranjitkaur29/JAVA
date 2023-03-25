package com.example.firstproject.Model.users;

import com.example.firstproject.Model.orders.Order;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

public @Data class User {
@Id
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;

    private List<Order> orders;





}
