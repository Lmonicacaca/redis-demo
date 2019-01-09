package com.example.redisdemo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "t_trade_flow")
public class TtradeFlow {
    @Id
    private Integer id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "bill_id")
    private String billId;
    @Column(name = "pay_channel")
    private String payChannel;
    @Column(name = "trade_type")
    private String tradeType;
    @Column(name = "use_type")
    private String useType;
    @Column(name = "batch_no")
    private String batchNo;
    @Column(name = "trade_no")
    private String tradeNo;
    @Column(name = "reqnbr")
    private String reqnbr;
    @Column(name = "complete_date")
    private Date completeDate;
    @Column(name = "trade_status")
    private String tradeStatus;
    @Column(name = "trade_amt")
    private BigDecimal tradeAmt;
    @Column(name = "req_date")
    private Date reqDate;
    @Column(name = "delete_flag")
    private String deleteFlag;
    @Column(name = "adjust_amt")
    private BigDecimal adjustAmt;
    @Column(name = "is_balance")
    private String isBalance;
    @Column(name = "fcd")
    private Date fcd;
    @Column(name = "lcd")
    private  Date lcd;
    @Column(name = "red_id")
    private String redId;
    @Column(name = "memo")
    private String memo;
    @Column(name = "zz_img_path")
    private String zzImgPath;
    @Column(name = "unified_deductions_param")
    private String unifiedDeductionsParam;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getReqnbr() {
        return reqnbr;
    }

    public void setReqnbr(String reqnbr) {
        this.reqnbr = reqnbr;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public BigDecimal getTradeAmt() {
        return tradeAmt;
    }

    public void setTradeAmt(BigDecimal tradeAmt) {
        this.tradeAmt = tradeAmt;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public BigDecimal getAdjustAmt() {
        return adjustAmt;
    }

    public void setAdjustAmt(BigDecimal adjustAmt) {
        this.adjustAmt = adjustAmt;
    }

    public String getIsBalance() {
        return isBalance;
    }

    public void setIsBalance(String isBalance) {
        this.isBalance = isBalance;
    }


    public Date getFcd() {
        return fcd;
    }

    public void setFcd(Date fcd) {
        this.fcd = fcd;
    }

    public Date getLcd() {
        return lcd;
    }

    public void setLcd(Date lcd) {
        this.lcd = lcd;
    }

    public String getRedId() {
        return redId;
    }

    public void setRedId(String redId) {
        this.redId = redId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getZzImgPath() {
        return zzImgPath;
    }

    public void setZzImgPath(String zzImgPath) {
        this.zzImgPath = zzImgPath;
    }

    public String getUnifiedDeductionsParam() {
        return unifiedDeductionsParam;
    }

    public void setUnifiedDeductionsParam(String unifiedDeductionsParam) {
        this.unifiedDeductionsParam = unifiedDeductionsParam;
    }
}
