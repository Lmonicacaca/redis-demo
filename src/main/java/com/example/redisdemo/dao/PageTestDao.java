package com.example.redisdemo.dao;

import com.example.redisdemo.common.TkMapper;
import com.example.redisdemo.domain.entity.PageTest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PageTestDao extends TkMapper<PageTest> {

    @Select("select * from pageTest")
    public List<PageTest> pageQuery();
}
