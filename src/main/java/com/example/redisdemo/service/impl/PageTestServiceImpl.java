package com.example.redisdemo.service.impl;

import com.example.redisdemo.MapStruct.TradeFlowMapper;
import com.example.redisdemo.dao.MappDao;
import com.example.redisdemo.dao.PageTestDao;
import com.example.redisdemo.dao.TradeFlowDao;
import com.example.redisdemo.domain.dto.TtradeFlowDto;
import com.example.redisdemo.domain.entity.PageTest;
import com.example.redisdemo.domain.entity.TtradeFlow;
import com.example.redisdemo.service.PageTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class PageTestServiceImpl implements PageTestService {

    @Resource
    private PageTestDao pageTestDao;
    @Resource
    private MappDao mappDao;
    @Resource
    private TradeFlowDao tradeFlowDao;

    @Override
    public List<PageTest> queryAll() {
        return pageTestDao.pageQuery();
    }

    @Override
    public List<Map<String, Object>> queryMap() {
        return mappDao.queryAll();
    }

    @Override
    public List<TtradeFlowDto> queryTradeFlow() {
        List<TtradeFlow> ttradeFlowList = tradeFlowDao.queryAll();
        List<TtradeFlowDto> returnList = TradeFlowMapper.TRADE_FLOW_MAPPER.tradeFlowToDtos(ttradeFlowList);

        return returnList;
    }
}
