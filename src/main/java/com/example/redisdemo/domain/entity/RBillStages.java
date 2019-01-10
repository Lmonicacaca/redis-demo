package com.example.redisdemo.domain.entity;

import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table
public class RBillStages {
    @Id
    private Integer id;
    @Column(name = "bill_id")
    private String billId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "stages")
    private Integer stages;
    @Column(name = "bill_date")
    private Date billDate;
    @Column(name = "bill_amt")
    private BigDecimal billAmt;
    @Column(name = "surplus_bill_amt)")
    private BigDecimal surplusBillAmt;
    @Column(name = "surplus_borrow_amt")
    private BigDecimal surplusBorrowAmt;
    @Column(name = "original_amt")
    private BigDecimal originalAmt;
    @Column(name = "interest")
    private BigDecimal interest;
    @Column(name = "repay_date")
    private Date repayDate;
    @Column(name = "actual_repay_date")
    private Date actualRepayDate;
    @Column(name = "acpay_amt")
    private BigDecimal acpayAmt;
    @Column(name = "repay_status")
    private String repayStatus;
    @Column(name = "expire_amt")
    private BigDecimal expireAmt;
    @Column(name = "expire_days")
    private Integer expireDays;
    @Column(name = "derate_amt")
    private BigDecimal derateAmt;
    @Column(name = "is_active")
    private String isActive;
    @Column(name = "debit_count")
    private Integer debitCount;
    @Column(name = "abnormal_status")
    private String abnormalStatus;
    @Column(name = "is_cc")
    private String isCC;
    @Column(name = "delete_flag")
    private String deleteFlag;
    @Column(name = "fcd")
    private Date fcd;
    @Column(name = "lcu")
    private String lcu;
    @Column(name = "lcd")
    private Date lcd;
    @Column(name = "memo")
    private String memo;
    @Column(name = "surplus_commission")
    private BigDecimal surplusCommission;
    @Column(name = "poundage")
    private BigDecimal poundage;
    @Column(name = "extension_fee")
    private BigDecimal extensionFee;
    @Column(name = "surplus_interest")
    private BigDecimal surplusInterest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
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

    public Integer getStages() {
        return stages;
    }

    public void setStages(Integer stages) {
        this.stages = stages;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public BigDecimal getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(BigDecimal billAmt) {
        this.billAmt = billAmt;
    }

    public BigDecimal getSurplusBillAmt() {
        return surplusBillAmt;
    }

    public void setSurplusBillAmt(BigDecimal surplusBillAmt) {
        this.surplusBillAmt = surplusBillAmt;
    }

    public BigDecimal getSurplusBorrowAmt() {
        return surplusBorrowAmt;
    }

    public void setSurplusBorrowAmt(BigDecimal surplusBorrowAmt) {
        this.surplusBorrowAmt = surplusBorrowAmt;
    }

    public BigDecimal getOriginalAmt() {
        return originalAmt;
    }

    public void setOriginalAmt(BigDecimal originalAmt) {
        this.originalAmt = originalAmt;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Date getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }

    public Date getActualRepayDate() {
        return actualRepayDate;
    }

    public void setActualRepayDate(Date actualRepayDate) {
        this.actualRepayDate = actualRepayDate;
    }

    public BigDecimal getAcpayAmt() {
        return acpayAmt;
    }

    public void setAcpayAmt(BigDecimal acpayAmt) {
        this.acpayAmt = acpayAmt;
    }

    public String getRepayStatus() {
        return repayStatus;
    }

    public void setRepayStatus(String repayStatus) {
        this.repayStatus = repayStatus;
    }

    public BigDecimal getExpireAmt() {
        return expireAmt;
    }

    public void setExpireAmt(BigDecimal expireAmt) {
        this.expireAmt = expireAmt;
    }

    public Integer getExpireDays() {
        return expireDays;
    }

    public void setExpireDays(Integer expireDays) {
        this.expireDays = expireDays;
    }

    public BigDecimal getDerateAmt() {
        return derateAmt;
    }

    public void setDerateAmt(BigDecimal derateAmt) {
        this.derateAmt = derateAmt;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Integer getDebitCount() {
        return debitCount;
    }

    public void setDebitCount(Integer debitCount) {
        this.debitCount = debitCount;
    }

    public String getAbnormalStatus() {
        return abnormalStatus;
    }

    public void setAbnormalStatus(String abnormalStatus) {
        this.abnormalStatus = abnormalStatus;
    }

    public String getIsCC() {
        return isCC;
    }

    public void setIsCC(String isCC) {
        this.isCC = isCC;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getFcd() {
        return fcd;
    }

    public void setFcd(Date fcd) {
        this.fcd = fcd;
    }

    public String getLcu() {
        return lcu;
    }

    public void setLcu(String lcu) {
        this.lcu = lcu;
    }

    public Date getLcd() {
        return lcd;
    }

    public void setLcd(Date lcd) {
        this.lcd = lcd;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BigDecimal getSurplusCommission() {
        return surplusCommission;
    }

    public void setSurplusCommission(BigDecimal surplusCommission) {
        this.surplusCommission = surplusCommission;
    }

    public BigDecimal getPoundage() {
        return poundage;
    }

    public void setPoundage(BigDecimal poundage) {
        this.poundage = poundage;
    }

    public BigDecimal getExtensionFee() {
        return extensionFee;
    }

    public void setExtensionFee(BigDecimal extensionFee) {
        this.extensionFee = extensionFee;
    }

    public BigDecimal getSurplusInterest() {
        return surplusInterest;
    }

    public void setSurplusInterest(BigDecimal surplusInterest) {
        this.surplusInterest = surplusInterest;
    }
}
