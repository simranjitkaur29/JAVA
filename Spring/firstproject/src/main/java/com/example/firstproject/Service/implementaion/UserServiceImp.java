package com.example.firstproject.Service.implementaion;

import com.example.firstproject.Service.interfaces.UserService;
import com.example.firstproject.Model.users.SignInRequest;
import com.example.firstproject.Model.users.SignInResponse;
import com.example.firstproject.Model.users.User;
import com.example.firstproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import static java.net.URI.hash;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user)
    {
      //User userAdded=  userRepository.save(user);
        return userRepository.save(user);
    }
    public User signUp(User user)
    {
        String password=user.getPassword();
        String encryptedToken=hash(password);
        user.setPassword(encryptedToken);
        userRepository.save(user);

        return null;
    }

    @Override
    public SignInResponse signIn(SignInRequest signInRequest)
    {
        SignInResponse signInResponse =new SignInResponse();
        String userName=signInResponse.getUserName();
        String password=signInRequest.getPassword();
        String token=hash(password);


    }

    private String hash(String password) {
        /*
        *   1. hashcode()
        *   2.
        *   3.
        *
        *
        * */

    }
}
