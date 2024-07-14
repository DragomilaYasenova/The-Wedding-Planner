package com.example.wed_connect.registration.repository;

import com.example.wed_connect.registration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{
    boolean existsByUsername(String username);
    boolean existsByPassword(String password);
}
