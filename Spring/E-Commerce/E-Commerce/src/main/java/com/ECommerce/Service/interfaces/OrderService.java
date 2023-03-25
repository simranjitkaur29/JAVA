package com.ECommerce.Service.interfaces;

import com.ECommerce.Model.Order.Order;

public interface OrderService {
     Order placeOrder(Order o);
    void cancelOrder(String userName); // implement it

    String updateAddress(String address, String username);




}
