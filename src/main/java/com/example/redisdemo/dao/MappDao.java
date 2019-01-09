package com.example.redisdemo.dao;

import com.example.redisdemo.common.TkMapper;
import com.example.redisdemo.domain.entity.Mapp;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface MappDao extends TkMapper<Mapp> {
    @Select("select app_name as appName,date_format(lcd,'%Y-%m-%d') from m_app")
    public List<Map<String,Object>> queryAll();
}
