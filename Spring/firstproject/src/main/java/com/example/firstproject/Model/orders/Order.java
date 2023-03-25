package com.example.firstproject.Model.orders;

import lombok.Data;

import java.util.List;

public class Order {

    private Integer orderId;
    private Integer userId;
    private Double totalPrice;

    private List<OrderItem> orderItem;



}
