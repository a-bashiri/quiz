package com.example.quiz.Repository;

import com.example.quiz.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {

    List<Restaurant> findAllByStatus(String status);
}
