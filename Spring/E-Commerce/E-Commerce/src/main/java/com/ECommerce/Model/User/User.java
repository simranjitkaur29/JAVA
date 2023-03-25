package com.ECommerce.Model.User;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

public @Data class User {
    @Id
    private String userName;
    private String firstName;
    private String lastName;
    private String email;

    private String password;



}
