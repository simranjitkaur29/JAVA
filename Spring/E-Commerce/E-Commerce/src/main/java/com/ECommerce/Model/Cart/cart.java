package com.ECommerce.Model.Cart;

import com.ECommerce.Model.Product.Product;
import com.ECommerce.Model.User.User;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Map;

public @Data class cart {


    private ProductQtyMap pmap;
    @Id
    private String username;
    private double totalamt;



}