package com.example.firstproject.Model.orders;

import com.example.firstproject.Model.Product.Product;
import lombok.Data;

public @Data class cartItem {

    private Integer cartId;

    private Integer quantity;

    private Product product;
}
