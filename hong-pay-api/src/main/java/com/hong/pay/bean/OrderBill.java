package com.hong.pay.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * <br>订单账单查询结果用</br>
 *
 */
public class OrderBill implements Serializable {

    private static final long serialVersionUID = -70427938085815316L;

    /**
     * 交易类型：1支付；2退款
     * */
    private int tradeType;

    /**
     * 业务类型：购物 还款
     * */
    private int bizType;

    /**
     *订单号
     * */
    private String bizOrderNo;

    /**
     *第三方交易号
     * */
    private String thirdDealNo;

    /**
     *金额 
     * */
    private Long amount;

    /**
     *交易时间
     * */
    private Date tradeTime;

    /**
     * 交易状态：支付[0待买家付款；1，4支付成功；2支付失败；3待卖家收款；]；退款：[0退款处理中；1退款成功；2退款失败；]
     * */
    private int status;

    /**
     *支付渠道：阿里、微信、财付通、银联
     * */
    private String payChannel;

    /**
     *用户ID
     * */
    private Long userId;

    public int getTradeType() {
        return tradeType;
    }

    public int getBizType() {
        return bizType;
    }

    public String getBizOrderNo() {
        return bizOrderNo;
    }

    public String getThirdDealNo() {
        return thirdDealNo;
    }

    public Long getAmount() {
        return amount;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public int getStatus() {
        return status;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public Long getUserId() {
        return userId;
    }

    public void setTradeType(int tradeType) {
        this.tradeType = tradeType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public void setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
    }

    public void setThirdDealNo(String thirdDealNo) {
        this.thirdDealNo = thirdDealNo;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
