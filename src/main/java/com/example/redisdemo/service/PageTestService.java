package com.example.redisdemo.service;

import com.example.redisdemo.domain.entity.PageTest;

import java.util.List;
import java.util.Map;

public interface PageTestService {
    public List<PageTest> queryAll();

    public List<Map<String, Object>> queryMap();
}
