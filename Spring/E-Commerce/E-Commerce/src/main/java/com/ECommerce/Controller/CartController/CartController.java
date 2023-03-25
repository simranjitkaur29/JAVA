package com.ECommerce.Controller.CartController;

import com.ECommerce.Model.Cart.GetUsername;
import com.ECommerce.Model.Cart.ProductQtyMap;
import com.ECommerce.Model.Cart.RequestCartAmt;
import com.ECommerce.Model.Cart.cart;
import com.ECommerce.Service.interfaces.CartService;
import com.ECommerce.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    CartService cartService;


    @RequestMapping(value="/addToCart",method = RequestMethod.POST)
    cart addtoCart(@RequestBody cart c1)
    {
        System.out.println(c1.getTotalamt());
        return cartService.addToCart(c1);
    }

    @RequestMapping(value="/getCartItem",method = RequestMethod.GET)
    ProductQtyMap get(@RequestBody GetUsername u1){
        return cartService.getCartItems(u1.getUsername());

    }

    @RequestMapping(value="/deleteAllCart",method = RequestMethod.POST)
    void deletecart(@RequestBody GetUsername u1){
        cartService.deleteAllCartIem(u1.getUsername());

    }
    @RequestMapping(value = "/updateCart",method=RequestMethod.POST)
    String amountUpdate(@RequestBody RequestCartAmt at)
    {
        return cartService.updateTotalAmt(at.getUsername(),at.getAmt());

    }

}
