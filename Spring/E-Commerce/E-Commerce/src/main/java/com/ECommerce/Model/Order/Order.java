package com.ECommerce.Model.Order;

import com.ECommerce.Model.Cart.cart;
import lombok.Data;
import org.springframework.data.annotation.Id;

public @Data class Order {

    @Id
    private String username;
    private Double totalPrice;

    cart c1;
    String address;

}
