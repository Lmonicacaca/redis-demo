package com.example.redisdemo.dao;

import com.example.redisdemo.common.TkMapper;
import com.example.redisdemo.domain.entity.RBillStages;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RBillStagesDao extends TkMapper<RBillStages> {
    @Select("select * from r_bill_stages")
    public List<RBillStages> queryAll();

    @Delete("<script>" +
            "delete from r_bill_stages where bill_id in " +
            "<foreach collection='billIds' item='billId' separator=',' open='(' close=')'>" +
            "#{billId}" +
            "</foreach>" +
            "</script>")
    public int deleteMany(@Param("billIds") List<String> billIds);
}
