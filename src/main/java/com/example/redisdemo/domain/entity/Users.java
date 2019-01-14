package com.example.redisdemo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "users")
public class Users {
    @Column(name = "user_name")
    private String userName;
    @Column(name = "pass_word")
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
