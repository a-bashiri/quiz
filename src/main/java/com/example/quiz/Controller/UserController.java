package com.example.quiz.Controller;

import com.example.quiz.Model.User;
import com.example.quiz.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {
    private final UserService userService;
    
    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/register")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        userService.deleteUserById(id);
        return "User deleted Successfully";
    }

    @GetMapping("/active")
    public int activeUsers(){
        return userService.getNumberOfActiveUsers();
    }

    @PostMapping("/login")
    public User login(@AuthenticationPrincipal User user){
        return user;
    }

}
