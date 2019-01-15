package com.example.redisdemo.service.impl;

import com.example.redisdemo.dao.ResourceDao;
import com.example.redisdemo.dao.RoleDao;
import com.example.redisdemo.domain.entity.Resource;
import com.example.redisdemo.domain.entity.Role;
import com.example.redisdemo.service.ResourceService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {
    @javax.annotation.Resource
    private ResourceDao resourceDao;
    @javax.annotation.Resource
    private RoleDao roleDao;
    @Override
    public Resource getResourceByUrl(String url) {
        return resourceDao.getResourceByUrl(url);
    }

    @Override
    public List<Role> getRoles(Integer resourceId) {
        return roleDao.getRolesByResourceId(resourceId);
    }

    @Override
    public HashSet<String> getUrlByUsername(String username) {
        return resourceDao.getUrlByUsername(username);
    }
}
