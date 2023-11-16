package com.example.quiz.Repository;

import com.example.quiz.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findAllByStatus(String status);

    List<Order> findAllByRestaurantId(Integer restaurantId);
    List<Order> findAllByCustomerName(String CustomerName);

}
