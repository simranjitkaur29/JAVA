package com.ECommerce.Service.implementaion;

import com.ECommerce.Model.Cart.ProductQtyMap;
import com.ECommerce.Model.Cart.cart;
import com.ECommerce.Service.interfaces.CartService;
import com.ECommerce.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepository cartRepository;
    @Override
    public cart addToCart(cart c1) {
      return   cartRepository.save(c1);
    }

    @Override
    public ProductQtyMap getCartItems(String userName) {
        if(cartRepository.existsById(userName))
        {
            return cartRepository.findById(userName).get().getPmap();

        }
        else
        {
            return null;
        }
    }

       @Override
    public void deleteAllCartIem(String username) {
        try {
            cartRepository.deleteById(username);
            System.out.println("Cart is Empty Now..");
        }
        catch (Exception e){
            System.out.println("Error User not exist");
        }

    }
    @Override
    public String updateTotalAmt(String userName, double amt) {
        cart c1=cartRepository.findById(userName).get();
        c1.setTotalamt(amt);
        cartRepository.save(c1);
        return "Successfully Updated";

    }


}
