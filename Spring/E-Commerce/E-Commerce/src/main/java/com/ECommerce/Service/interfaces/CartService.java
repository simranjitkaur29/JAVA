package com.ECommerce.Service.interfaces;

import com.ECommerce.Model.Cart.ProductQtyMap;
import com.ECommerce.Model.Cart.cart;
import com.ECommerce.Model.Product.Product;

import java.util.List;
import java.util.Map;

public interface CartService {

    public cart addToCart(cart c1);
   // public void addToCart(Integer productId,Integer quantity,Integer userId);

    ProductQtyMap getCartItems(String userName);

    //public void deleteCartItem(String userName);

    public void deleteAllCartIem(String username);

    //public void updateCartItem(String userName, String pid, int qty);

    String updateTotalAmt(String userName, double amt);
}
