package com.example.quiz.Service;

import com.example.quiz.Model.Restaurant;
import com.example.quiz.Repository.RestaurantRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepo restaurantRepo;

    public List<Restaurant> getRestaurants(){
        return restaurantRepo.findAll();
    }

    public Restaurant createRestaurant(Restaurant restaurant){
        restaurant.setCreatedDate(new Date());
        return restaurantRepo.save(restaurant);
    }

    public Restaurant updateRestaurant(Restaurant restaurant){
        return restaurantRepo.save(restaurant);
    }


}
