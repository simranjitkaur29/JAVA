package com.ECommerce.Service.implementaion;

import com.ECommerce.Model.Order.Order;
import com.ECommerce.Service.interfaces.OrderService;
import com.ECommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order placeOrder(Order o)
    {
        return orderRepository.save(o);
    }
    public void cancelOrder(String userName)
    {
        orderRepository.deleteById(userName);
    }
    public String updateAddress(String add, String username){

        try {
            Order or = orderRepository.findById(username).get();
            or.setAddress(add);
            orderRepository.save(or);
            return "Updated Address Succesfully";
        }
        catch(Exception e){
            return "Can't Update Order Doesn't Exist";
        }

    }


}
