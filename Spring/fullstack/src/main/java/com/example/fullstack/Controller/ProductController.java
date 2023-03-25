package com.example.fullstack.Controller;

import com.example.fullstack.Model.Product;
import com.example.fullstack.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value="/addProduct",method= RequestMethod.POST)
    Product  addProduct(@RequestBody Product product){
       return productRepository.save(product);

    }
    @RequestMapping(value="/getProduct",method=RequestMethod.GET)
    List<Product> getProduct(){
        return productRepository.findAll();

    }


}
