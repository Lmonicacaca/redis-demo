package com.example.redisdemo.dao;

import com.example.redisdemo.common.TkMapper;
import com.example.redisdemo.domain.entity.RBillStages;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RBillStagesDao extends TkMapper<RBillStages> {
    @Select("select * from r_bill_stages")
    public List<RBillStages> queryAll();
}
