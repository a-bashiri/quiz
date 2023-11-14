package com.example.quiz.Controller;

import com.example.quiz.Model.Restaurant;
import com.example.quiz.Service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping()
    public List<Restaurant> getRestaurants(){
        return restaurantService.getRestaurants();
    }

    @PostMapping("/create")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.createRestaurant(restaurant);
    }

    @PutMapping("/update")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.updateRestaurant(restaurant);
    }
}
