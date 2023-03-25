package com.ECommerce.Model.users;


import com.ECommerce.Model.orders.Order;
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
