package com.hong.pay.dto;

import com.hong.pay.enums.RefundStatus;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * <br>退款异步通知结果</br>
 */
public class RefundNotifyResult implements Serializable {

    private static final long serialVersionUID = 8695297859795986206L;

    /**
     * 订单相关
     */

    /**
     * 支付号，与第三方支付交互（out_trade_no）
     */
    private String payId;

    /**
     * 订单金额
     */
    private Long orderAmt;

    /**
     * 第三方支付交易号
     */
    private String thirdTradeNo;

    /**
     * 退款批次相关
     */

    /**
     * 退款号
     */
    private String refundId;

    /**
     * 退款金额
     */
    private Long refundAmt;

    /**
     * 退费比率
     */
    private int refundRate;

    /**
     * 第三方退款号
     */
    private String thirdRefundNo;

    /**
     * 退款状态
     */
    private RefundStatus status;

    /**
     * 交易时间
     */
    private Date tradeTime;

    /**
     * 业务参数
     */

    /**
     * 业务订单类型
     */
    private int orderType;

    /**
     * 业务订单号
     */
    private String orderNo;

    /**
     * 业务退款类型
     */
    private int refundType;

    /**
     * 业务退款单号
     */
    private String refundNo;

    /**
     * 附加数据
     */
    private String extraData;

    /**
     * 响应给第三方数据
     */
    private String response;

    public int getRefundType() {
        return refundType;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public int getOrderType() {
        return orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setRefundType(int refundType) {
        this.refundType = refundType;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

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

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public Long getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(Long refundAmt) {
        this.refundAmt = refundAmt;
    }

    public String getThirdRefundNo() {
        return thirdRefundNo;
    }

    public void setThirdRefundNo(String thirdRefundNo) {
        this.thirdRefundNo = thirdRefundNo;
    }

    public RefundStatus getStatus() {
        return status;
    }

    public void setStatus(RefundStatus status) {
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getRefundRate() {
        return refundRate;
    }

    public void setRefundRate(int refundRate) {
        this.refundRate = refundRate;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getExtraData() {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
