package com.hong.pay.dto;

import com.hong.pay.enums.PaymentStatus;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * <br>支付查询结果</br>
 *
 */
public class PayQueryResult implements Serializable {

    private static final long serialVersionUID = 8165960762114453130L;

    /**
     *  支付号
     */
    private String payId;

    /**
     * 订单金额
     */
    private Long orderAmt;

    /**
     * 第三方交易号
     */
    private String thirdTradeNo;

    /**
     * 交易时间
     */
    private Date tradeTime;

    /**
     * 支付状态
     */
    private PaymentStatus status;

    /**
     * 是否退款
     */
    private Boolean isRefund;

    /**
     * 退款金额
     */
    private Long refundAmt;

    /**
     * 退款时间
     */
    private Date refundTime;

    public String getPayId() {
        return payId;
    }

    public Long getOrderAmt() {
        return orderAmt;
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public Boolean isRefund() {
        return isRefund;
    }

    public Long getRefundAmt() {
        return refundAmt;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public void setOrderAmt(long orderAmt) {
        this.orderAmt = orderAmt;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public void setRefund(Boolean isRefund) {
        this.isRefund = isRefund;
    }

    public void setRefundAmt(long refundAmt) {
        this.refundAmt = refundAmt;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
