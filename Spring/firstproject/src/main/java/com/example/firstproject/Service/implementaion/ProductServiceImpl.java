package com.example.firstproject.Service.implementaion;

import com.example.firstproject.Model.Product.Product;
import com.example.firstproject.Service.interfaces.ProductService;
import com.example.firstproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

 public   Product AddThProduct(Product p1)
   {
    return productRepository.save(p1);
   }
}
