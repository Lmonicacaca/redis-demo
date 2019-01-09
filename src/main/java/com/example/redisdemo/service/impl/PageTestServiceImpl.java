package com.example.redisdemo.service.impl;

import com.example.redisdemo.dao.MappDao;
import com.example.redisdemo.dao.PageTestDao;
import com.example.redisdemo.domain.entity.PageTest;
import com.example.redisdemo.service.PageTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PageTestServiceImpl implements PageTestService {

    @Resource
    private PageTestDao pageTestDao;
    @Resource
    private MappDao mappDao;

    @Override
    public List<PageTest> queryAll() {
        return pageTestDao.pageQuery();
    }

    @Override
    public List<Map<String, Object>> queryMap() {
        return mappDao.queryAll();
    }
}
