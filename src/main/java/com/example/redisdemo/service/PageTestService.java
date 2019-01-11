package com.example.redisdemo.service;

import com.example.redisdemo.domain.dto.TtradeFlowDto;
import com.example.redisdemo.domain.entity.PageTest;
import com.example.redisdemo.domain.entity.RBillStages;

import java.util.List;
import java.util.Map;

public interface PageTestService {
    public List<PageTest> queryAll();

    public List<Map<String, Object>> queryMap();

    public List<TtradeFlowDto> queryTradeFlow();

    public List<RBillStages> queryBillStages();
    public int deleteBatchBillStages(Map<String,Object> paramMap);
}
