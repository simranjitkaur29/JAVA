package com.ECommerce.Service.interfaces;


import com.ECommerce.Model.Product.Product;

import java.util.List;

public interface ProductService {
    // Insert
    Product AddThProduct(Product p1);

    List<Product> ShowAllProducts();
    Product showById(String pid);
//    List<Product>searchProductByName(String name);
//    List<Product>searchProductByCategory(String category);
//
//    List<Product>listAllProducts();//homework3
//
//    List<Product>searchProductByCategoryAndBrand(String category,String brand);
//
//  Product  addProductToCatalog(Product product);
//
//  Product deleteProductFromCatalog(String productId);
//
//  Product updateDiscount(String productId,)


}
