package com.example.redisdemo.dao;

import com.example.redisdemo.common.TkMapper;
import com.example.redisdemo.domain.entity.TtradeFlow;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TradeFlowDao extends TkMapper<TtradeFlow> {
    @Select("select order_id as orderId,bill_id as billId,fcd,trade_type as tradeType from t_trade_flow")
    public List<TtradeFlow> queryAll();
}
