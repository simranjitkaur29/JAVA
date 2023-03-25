package com.example.firstproject.Model.orders;

import com.example.firstproject.Model.Product.Product;
import lombok.Data;

public @Data class  OrderItem {

    private  Integer orderItemId;

    private int quantity;

    private double price;

    private Product product;

    private int orderId;

}
