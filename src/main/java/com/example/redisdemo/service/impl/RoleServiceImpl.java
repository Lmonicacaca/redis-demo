package com.example.redisdemo.service.impl;

import com.example.redisdemo.dao.RoleDao;
import com.example.redisdemo.domain.entity.Role;
import com.example.redisdemo.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleDao roleDao;
    @Override
    public List<Role> getRolesByUserName(String username) {
        return roleDao.getRolesByUsername(username);
    }
}
