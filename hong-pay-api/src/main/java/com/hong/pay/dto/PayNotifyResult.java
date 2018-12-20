package com.hong.pay.dto;

import com.hong.pay.enums.PaymentStatus;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.io.Serializable;
import java.util.Date;

/**
 * <br>支付异步通知处理结果</br>
 */
public class PayNotifyResult implements Serializable {

    private static final long serialVersionUID = -6256136837171857492L;

    /**
     * 支付号
     */
    private String payId;

    /**
     * 订单金额
     */
    private Long orderAmt;

    /**
     * 支付渠道类型
     */
    private String channelType;

    /**
     * 第三方交易号
     */
    private String thirdTradeNo;

    /**
     * 付款时间
     */
    private Date tradeTime;

    /**
     * 支付时的附加数据，异步通知时原样返回
     */
    private String attachData;

    /**
     * 批量结果数据（当为批量支付时有值）
     */
    private String batchData;

    /**
     * 支付状态
     */
    private PaymentStatus status;

    /**
     * 响应给第三方支付异步回调的数据
     */
    private String response;

    /**
     * 银行类型
     */
    private String bankType;

    /**
     * 业务类型
     */
    private int bizType;

    /**
     * 业务订单类型
     */
    private int orderType;

    /**
     * 业务订单号
     */
    private String orderNo;

    /**
     * 附加数据
     */
    private String extraData;

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public Long getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(Long orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getAttachData() {
        return attachData;
    }

    public void setAttachData(String attachData) {
        this.attachData = attachData;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBatchData() {
        return batchData;
    }

    public void setBatchData(String batchData) {
        this.batchData = batchData;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getExtraData() {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    public int getBizType() {
        return bizType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
