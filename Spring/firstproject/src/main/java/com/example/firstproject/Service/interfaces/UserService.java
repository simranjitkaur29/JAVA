package com.example.firstproject.Service.interfaces;

import com.example.firstproject.Model.users.SignInRequest;
import com.example.firstproject.Model.users.SignInResponse;
import com.example.firstproject.Model.users.User;

public interface UserService {

    public User addUser(User user);

    public  User signUp(User user);

    public SignInResponse signIn(SignInRequest signInRequest);




}
