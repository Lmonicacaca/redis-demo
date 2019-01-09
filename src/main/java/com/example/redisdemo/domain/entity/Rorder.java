package com.example.redisdemo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "r_order")
public class Rorder {
    @Id
    private Integer id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "orgin_order_id")
    private String orginOrderId;
    @Column(name = "last_order_id")
    private String lastOrderId;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "pay_ways")
    private String payWays;
    @Column(name = "status")
    private String status;
    @Column(name = "days")
    private Integer days;
    @Column(name = "borrow_amt")
    private BigDecimal borrowAmt;
    @Column(name = "arrival_amt")
    private BigDecimal arrivalAmt;
    @Column(name = "interest")
    private BigDecimal interest;
    @Column(name = "review_amt")
    private BigDecimal reviewAmt;
    @Column(name = "manager_amt")
    private BigDecimal managerAmt;
    @Column(name = "serve_amt")
    private BigDecimal serveAmt;
    @Column(name = "protocol_url")
    private String protocolUrl;
    @Column(name = "audit_date")
    private Date auditDate;
    @Column(name = "auditor")
    private String auditor;
    @Column(name = "delete_flag")
    private String deleteFlag;
    @Column(name = "lcu")
    private String lcu;
    @Column(name = "lcd")
    private Date lcd;
    @Column(name = "memo")
    private String memo;
    @Column(name = "bank_card")
    private String bankCard;
    @Column(name = "comfirm_code")
    private Integer comfirmCode;

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

    public String getOrginOrderId() {
        return orginOrderId;
    }

    public void setOrginOrderId(String orginOrderId) {
        this.orginOrderId = orginOrderId;
    }

    public String getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(String lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getPayWays() {
        return payWays;
    }

    public void setPayWays(String payWays) {
        this.payWays = payWays;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public BigDecimal getBorrowAmt() {
        return borrowAmt;
    }

    public void setBorrowAmt(BigDecimal borrowAmt) {
        this.borrowAmt = borrowAmt;
    }

    public BigDecimal getArrivalAmt() {
        return arrivalAmt;
    }

    public void setArrivalAmt(BigDecimal arrivalAmt) {
        this.arrivalAmt = arrivalAmt;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getReviewAmt() {
        return reviewAmt;
    }

    public void setReviewAmt(BigDecimal reviewAmt) {
        this.reviewAmt = reviewAmt;
    }

    public BigDecimal getManagerAmt() {
        return managerAmt;
    }

    public void setManagerAmt(BigDecimal managerAmt) {
        this.managerAmt = managerAmt;
    }

    public BigDecimal getServeAmt() {
        return serveAmt;
    }

    public void setServeAmt(BigDecimal serveAmt) {
        this.serveAmt = serveAmt;
    }

    public String getProtocolUrl() {
        return protocolUrl;
    }

    public void setProtocolUrl(String protocolUrl) {
        this.protocolUrl = protocolUrl;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
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

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public Integer getComfirmCode() {
        return comfirmCode;
    }

    public void setComfirmCode(Integer comfirmCode) {
        this.comfirmCode = comfirmCode;
    }
}
