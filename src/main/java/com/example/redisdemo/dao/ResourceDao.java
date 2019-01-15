package com.example.redisdemo.dao;

import com.example.redisdemo.common.TkMapper;
import com.example.redisdemo.domain.entity.Resource;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashSet;

public interface ResourceDao extends TkMapper<Resource> {
    @Select("select * from resource where url =#{url}")
    public Resource getResourceByUrl(@Param("url") String url);

    @Select("select url from role_resource as rr,user_role as ur,resource as r where ur.username=#{username} and ur.role_id = rr.role_id and rr.resource_id=r.id")
    public HashSet<String> getUrlByUsername(@Param("username")String username);
}
