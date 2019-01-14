package com.example.redisdemo.service.impl;

import com.example.redisdemo.configer.UserDetailsImpl;
import com.example.redisdemo.domain.entity.Users;
import com.example.redisdemo.service.RoleService;
import com.example.redisdemo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsersService usersService;
    @Autowired
    private RoleService roleService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users userByName = usersService.findUserByName(username);
        if(userByName ==null){
            throw new UsernameNotFoundException("没有该用户！");
        }
        return new UserDetailsImpl(userByName,roleService.getRolesByUserName(username));
    }
}
