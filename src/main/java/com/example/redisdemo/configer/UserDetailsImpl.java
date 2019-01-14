package com.example.redisdemo.configer;

import com.example.redisdemo.domain.entity.Role;
import com.example.redisdemo.domain.entity.Users;
import com.example.redisdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails {
    private String userName;
    private String passWord;
    private List<Role> roles;

    /**
     * 无参构造c
     */
    public UserDetailsImpl() {
    }

    /**
     * 用User构造
     */
    public UserDetailsImpl(Users user) {
        this.userName = user.getUserName();
        this.passWord = user.getPassWord();
    }

    /**
     * 用User和List<Role>构造
     */
    public UserDetailsImpl(Users user, List<Role> roles) {
        this.userName = user.getUserName();
        this.passWord = user.getPassWord();
        this.roles = roles;
    }

    public List<Role> getRoles(){
        return roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    /**
     * 返回用户所有角色的封装，一个Role对应一个GrantedAuthority
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for(Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return passWord;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    /**
     * 判断账号是否已经过期，默认没有过期
     */
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    /**
     * 判断账号是否被锁定，默认没有锁定
     */
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    /**
     * 判断信用凭证是否过期，默认没有过期
     */
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    /**
     * 判断账号是否可用，默认可用
     */
    public boolean isEnabled() {
        return true;
    }
}
