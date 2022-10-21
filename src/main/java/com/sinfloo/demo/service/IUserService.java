package com.sinfloo.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sinfloo.demo.controller.dto.UserRegistroDTO;
import com.sinfloo.demo.model.User;

public interface IUserService extends UserDetailsService{
    User save(UserRegistroDTO registrationDto);
    User findByUsername(String username);

}
