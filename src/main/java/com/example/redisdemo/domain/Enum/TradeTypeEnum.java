package com.example.redisdemo.domain.Enum;

public enum  TradeTypeEnum {
    DS("代收"),DF("代付");
    private String type;
    TradeTypeEnum(String type){
        this.type = type;
    }
}
