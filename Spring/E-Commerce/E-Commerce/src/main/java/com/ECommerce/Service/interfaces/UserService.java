package com.ECommerce.Service.interfaces;

import com.ECommerce.Model.User.User;

public interface UserService {
    User AddTheUser(User id);
    String SignIn(String username,String password);


    User showByIdUser(String id);



}
