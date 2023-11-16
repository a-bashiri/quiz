package com.example.quiz.Service;

import com.example.quiz.Model.Order;
import com.example.quiz.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order createOrder(Order orders){
        orders.setCreatedDate(new Date());
        return orderRepository.save(orders);
    }

    public Order updateOrder(Order orders){

        return orderRepository.save(orders);
    }

    public int getNumberOfOrdersByStatus(String status) {
        return orderRepository.findAllByStatus(status).size();
    }

    public List<Order> getOrdersByRestaurantId(Integer id) {
        return orderRepository.findAllByRestaurantId(id);
    }

    public List<Order> getOrdersByCustomerName(String username) {
        return orderRepository.findAllByCustomerName(username);
    }
}
