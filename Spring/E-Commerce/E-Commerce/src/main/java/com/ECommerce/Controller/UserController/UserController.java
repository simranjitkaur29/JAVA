package com.ECommerce.Controller.UserController;

import com.ECommerce.Model.Product.RequestShowByid;
import com.ECommerce.Model.User.SignInRequest;
import com.ECommerce.Model.User.User;
import com.ECommerce.Service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping(value = "/userAdd",method = RequestMethod.POST)

        User addUser(@RequestBody User user1)
        {
            return userService.AddTheUser(user1);
        }

    @RequestMapping(value = "/showUserById",method = RequestMethod.GET)
        User showById(@RequestBody RequestShowByid id)
    {
        return userService.showByIdUser(id.getPid());
    }
    @RequestMapping(value="/SignIn",method = RequestMethod.GET)
    String signIn(@RequestBody SignInRequest user)
    {
        return userService.SignIn(user.getUserName(),user.getPassword());
    }
}
