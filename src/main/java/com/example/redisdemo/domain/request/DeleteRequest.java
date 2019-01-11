package com.example.redisdemo.domain.request;

import java.util.List;

public class DeleteRequest {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
