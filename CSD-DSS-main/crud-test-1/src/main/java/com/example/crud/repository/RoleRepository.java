package com.example.crud.repository;

import com.example.crud.entity.Role;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, Long> {
    Role findByName(String name);
}
