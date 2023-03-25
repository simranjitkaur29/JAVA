package com.ECommerce.Service.implementaion;


import com.ECommerce.Model.Product.Product;
import com.ECommerce.Service.interfaces.ProductService;
import com.ECommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;



    //
    /*
    *
    *
    *
    * */
    //

 public Product AddThProduct(Product p1)
   {
    return productRepository.save(p1);
   }
   public List<Product> ShowAllProducts(){
     return productRepository.findAll();
   }
   public Product showById(String pid)
   {
       try {
           Product p1 = productRepository.findById(pid).get();
           return p1;
       }
       catch(Exception e){
           return null;

       }



   }
}
