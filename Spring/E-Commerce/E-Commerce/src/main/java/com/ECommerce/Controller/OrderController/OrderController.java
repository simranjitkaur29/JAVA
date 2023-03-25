package com.ECommerce.Controller.OrderController;

import com.ECommerce.Model.Cart.GetUsername;
import com.ECommerce.Model.Order.Order;
import com.ECommerce.Model.Order.OrderAddress;
import com.ECommerce.Service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/placeOrder",method = RequestMethod.POST)
    Order order(@RequestBody Order o)
    {
        return orderService.placeOrder(o);
    }

    @RequestMapping(value="/cancelOrder",method = RequestMethod.POST)
     void cancelOrder(@RequestBody GetUsername u1)
    {
         orderService.cancelOrder(u1.getUsername());
    }

    @RequestMapping(value = "/updateOrderAddress",method=RequestMethod.POST)
    String update(@RequestBody OrderAddress oda){
        return orderService.updateAddress(oda.getAddress(),oda.getUsername());
    }





}
