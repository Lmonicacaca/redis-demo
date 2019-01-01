package com.example.redisdemo.domain.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "pageTest")
public class PageTest {

    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
