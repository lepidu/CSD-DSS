package com.example.crud.repository;

import com.example.crud.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface userRepository extends MongoRepository<User, Long> {
    User findByEmail(String email);
}
