package com.example.redisdemo.dao;

import com.example.redisdemo.common.TkMapper;
import com.example.redisdemo.domain.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UsersDao extends TkMapper<Users> {
    @Select("select * from users where username=#{username}")
    public Users findUserByUsername(@Param("username") String username);
}
