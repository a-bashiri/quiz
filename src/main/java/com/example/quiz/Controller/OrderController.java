package com.example.quiz.Controller;

import com.example.quiz.Model.Order;
import com.example.quiz.Model.User;
import com.example.quiz.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/order")
public class OrderController {
    private final OrderService orderService;
    
    @GetMapping("/all")
    public List<Order> getAllOrder(){
        return orderService.getAllOrders();
    }

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order orders){
        return orderService.createOrder(orders);
    }

    @PutMapping("/update")
    public Order updateOrder(@RequestBody Order orders){
        return orderService.updateOrder(orders);
    }

    @GetMapping("/status/{status}")
    public int numberOfOrdersByStatus(@PathVariable String status){
        return orderService.getNumberOfOrdersByStatus(status);
    }

    @GetMapping("/by-restaurant-id/{id}")
    public List<Order> ordersByRestaurantId(@PathVariable Integer id){
        return orderService.getOrdersByRestaurantId(id);
    }

    @GetMapping("/customer")
    public List<Order> ordersByCustomerName(@AuthenticationPrincipal User user){
        return orderService.getOrdersByCustomerName(user.getUsername());
    }
}
