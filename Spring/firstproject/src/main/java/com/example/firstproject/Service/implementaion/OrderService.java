package com.example.firstproject.Service.implementaion;

import com.example.firstproject.Service.interfaces.CartService;
import com.example.firstproject.Model.orders.cartItem;
import com.example.firstproject.Model.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    CartService cartService;
    public void createOrder(User user)
    {
        //get cart items related to this user


        List<cartItem> cartItems=cartService.getcartIems(user);
    }

}
