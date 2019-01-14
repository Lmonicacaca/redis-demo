package com.example.redisdemo.service;

import com.example.redisdemo.domain.entity.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getRolesByUserName(String username);
 }
