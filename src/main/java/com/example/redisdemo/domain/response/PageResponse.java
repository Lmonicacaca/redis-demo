package com.example.redisdemo.domain.response;

import java.util.List;
import java.util.Map;

public class PageResponse<T> {
    private Integer total;
    private List<T> list;

    private Map<String,Object> map;

    public PageResponse(Integer total,List list){

        this.total = total;
        this.list = list;
    }
    public PageResponse(Integer total,Map<String,Object> map){

        this.total = total;
        this.map = map;
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

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
