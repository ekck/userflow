package com.example.userflow.service;

import com.example.userflow.dto.UserDto;
import com.example.userflow.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}
