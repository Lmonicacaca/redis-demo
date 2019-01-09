package com.example.redisdemo.domain.Enum;

public enum  TradeStatusEnum {
    A("请求中"),B("成功"),C("失败");
    private String status;
    TradeStatusEnum(String status){
        this.status = status;
    }
}
