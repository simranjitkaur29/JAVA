package com.ECommerce.Controller.ProductController;

import com.ECommerce.Model.Product.Product;
import com.ECommerce.Model.Product.RequestShowByid;
import com.ECommerce.Service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;


      // Post or get
     // get : data take from db
    // post put data in db

    @RequestMapping(value = "/productAdd",method = RequestMethod.POST)
    Product addData(@RequestBody Product p1){
        return productService.AddThProduct(p1);
    }
    @RequestMapping(value = "/showAllProduct",method=RequestMethod.GET)
    List<Product> showProducts(){
        return productService.ShowAllProducts();
    }
    @RequestMapping(value = "/showByIdProduct",method =RequestMethod.GET)
    Product showByIdProduct(@RequestBody RequestShowByid id)
    {
        return productService.showById(id.getPid());
    }

}
