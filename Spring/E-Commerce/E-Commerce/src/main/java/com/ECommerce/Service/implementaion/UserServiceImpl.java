package com.ECommerce.Service.implementaion;

import com.ECommerce.Model.User.User;
import com.ECommerce.Service.interfaces.UserService;
import com.ECommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public User AddTheUser(User user)
    {
       return userRepository.save(user);
    }
    public User showByIdUser(String id)
    {
        try
        {
            User user1=userRepository.findById(id).get();
            return user1;
        }
        catch(Exception e){
            return null;
        }

    }
    @Override
    public String SignIn(String username, String password) {

        Optional<User> user=userRepository.findById(username);

        if(user.isPresent())

        {
            User userId=user.get();
            System.out.println(userId.getUserName()+ " "+userId.getPassword());
            System.out.println(username +"  "+password);
              if(username.equals(userId.getUserName()) && password.equals(userId.getPassword()))
              {
                  return "Success";
              }
              else {
                  return "fail";
              }
        }
        else{
            return "User not exist..";
        }

    }

}
