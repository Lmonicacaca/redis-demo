package com.example.redisdemo.dao;

import com.example.redisdemo.common.TkMapper;
import com.example.redisdemo.domain.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleDao extends TkMapper<Role> {

    @Select("select * from role where id in(select role_id from user_role where username = #{userName})")
    public List<Role> getRolesByUsername(@Param("userName") String userName);

    @Select("select * from role where id in(select role_id from role_resource where resource_id=#{resourceId})")
    public List<Role> getRolesByResourceId(@Param("resourceId")Integer resourceId);
}
