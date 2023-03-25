package com.ECommerce.Model.Product;

import lombok.Data;
import org.springframework.data.annotation.Id;

public @Data class Product {
    @Id
    private String pid;
    private String productname;
    private  Double price;
       private  Double rating;


    private Double discount;

    private String category;

    private  String brand;
}
