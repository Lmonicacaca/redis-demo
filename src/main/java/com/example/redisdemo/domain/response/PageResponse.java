package com.example.redisdemo.domain.response;

import java.util.List;

public class PageResponse<T> {
    private Integer total;
    private List<T> list;

    public PageResponse(Integer total,List list){

        this.total = total;
        this.list = list;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
