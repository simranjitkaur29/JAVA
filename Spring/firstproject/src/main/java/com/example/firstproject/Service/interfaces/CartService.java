package com.example.firstproject.Service.interfaces;

import com.example.firstproject.Model.Product.Product;
import com.example.firstproject.Model.orders.cartItem;
import com.example.firstproject.Model.users.User;

import java.util.List;

public interface CartService {

    public void addToCart(Integer productId,Integer quantity,Integer userId);

    public List<cartItem> getCartItems(User user);

    public void deleteCartItem(Integer cartId,Integer userId);

    public void deleteAllCartIem(User user);

    public void updateCartItem(cartItem cartItem, User user, Product product);
}
