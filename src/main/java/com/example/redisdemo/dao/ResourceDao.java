package com.example.redisdemo.dao;

import com.example.redisdemo.common.TkMapper;
import com.example.redisdemo.domain.entity.Resource;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ResourceDao extends TkMapper<Resource> {
    @Select("select * from resource where url =#{url}")
    public Resource getResourceByUrl(@Param("url") String url);
}
