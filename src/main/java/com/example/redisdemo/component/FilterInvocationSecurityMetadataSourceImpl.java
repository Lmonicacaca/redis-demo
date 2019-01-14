package com.example.redisdemo.component;

import com.example.redisdemo.domain.entity.Resource;
import com.example.redisdemo.domain.entity.Role;
import com.example.redisdemo.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * 该类用于找到可以访问该url的roles集合
 */
@Component
public class FilterInvocationSecurityMetadataSourceImpl implements FilterInvocationSecurityMetadataSource {
    @javax.annotation.Resource
    private ResourceService resourceService;

    /**
     * 接受用户的请求，并返回访问该地址需要的所有权限
     * @param o
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        //得到用户的请求地址,控制台输出一下
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        System.out.println("用户请求的地址是：" + requestUrl);

        //如果登录页面就不需要权限
        if ("/login".equals(requestUrl)) {
            return null;
        }

        Resource resource = resourceService.getResourceByUrl(requestUrl);

        //如果没有匹配的url则说明大家都可以访问
        if(resource == null) {
            return SecurityConfig.createList("ROLE_LOGIN");
        }

        //将resource所需要到的roles按框架要求封装返回（ResourceService里面的getRoles方法是基于RoleRepository实现的）
        List<Role> roles = resourceService.getRoles(resource.getId());
        int size = roles.size();
        String[] values = new String[size];
        for (int i = 0; i < size; i++) {
            values[i] = roles.get(i).getRoleName();
        }
        return SecurityConfig.createList(values);
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
