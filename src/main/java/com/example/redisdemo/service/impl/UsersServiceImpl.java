package com.example.redisdemo.service.impl;

import com.example.redisdemo.dao.UsersDao;
import com.example.redisdemo.domain.entity.Users;
import com.example.redisdemo.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;
    @Override
    public Users findUserByName(String username) {
        return usersDao.findUserByUsername(username);
    }
}
