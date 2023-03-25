package com.ECommerce.Model.User;

import lombok.Data;

public @Data class SignInRequest {
    private String userName;
    private String password;

}
