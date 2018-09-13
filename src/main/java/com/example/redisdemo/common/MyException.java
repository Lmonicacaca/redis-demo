package com.example.redisdemo.common;

public class MyException extends Exception{
    private String code;
    private String msg;
    public MyException(String code,String msg){
        super(msg);
        this.code = code;
        this.msg  =msg;
    }
}
