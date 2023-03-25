package com.example.firstproject.Model.Product;

import lombok.Data;
import org.springframework.data.annotation.Id;

public @Data class Product {
    @Id
    private String pid;
    private String productname;

//    private Integer productId;
//
//    private String title;
//
//    private  Double price;
//
//    private String reviews;
//
//    private  Double rating;
//
//    private  String image;
//
//    private Double discount;
//
//    private String category;
//
//    private  String brand;
}
