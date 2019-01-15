package com.example.redisdemo.service;

import com.example.redisdemo.domain.entity.Resource;
import com.example.redisdemo.domain.entity.Role;

import java.util.HashSet;
import java.util.List;

public interface ResourceService {
    public Resource getResourceByUrl(String url);

    public List<Role> getRoles(Integer resourceId);

    public HashSet<String>  getUrlByUsername(String username);
}
