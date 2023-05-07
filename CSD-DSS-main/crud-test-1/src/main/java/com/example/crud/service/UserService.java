package com.example.crud.service;

import com.example.crud.dto.*;
import com.example.crud.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}