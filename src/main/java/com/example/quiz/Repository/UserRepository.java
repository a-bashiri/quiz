package com.example.quiz.Repository;

import com.example.quiz.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findAllByStatus(String active);

    User findUserByUsername(String username);
}
