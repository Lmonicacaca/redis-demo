package com.example.redisdemo.domain.dto;

import com.example.redisdemo.domain.Enum.TradeStatusEnum;
import com.example.redisdemo.domain.Enum.TradeTypeEnum;

import java.util.Date;

public class TtradeFlowDto {
    private String orderId;
    private String billId;
    private TradeTypeEnum tradeTypeEnum;
    private TradeStatusEnum tradeStatusEnum;
    private String fcd;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public TradeTypeEnum getTradeTypeEnum() {
        return tradeTypeEnum;
    }

    public void setTradeTypeEnum(TradeTypeEnum tradeTypeEnum) {
        this.tradeTypeEnum = tradeTypeEnum;
    }

    public TradeStatusEnum getTradeStatusEnum() {
        return tradeStatusEnum;
    }

    public void setTradeStatusEnum(TradeStatusEnum tradeStatusEnum) {
        this.tradeStatusEnum = tradeStatusEnum;
    }

    public String getFcd() {
        return fcd;
    }

    public void setFcd(String fcd) {
        this.fcd = fcd;
    }
}
