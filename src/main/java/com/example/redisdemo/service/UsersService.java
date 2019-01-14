package com.example.redisdemo.service;

import com.example.redisdemo.domain.entity.Users;

public interface UsersService {
    public Users findUserByName(String username);
}
