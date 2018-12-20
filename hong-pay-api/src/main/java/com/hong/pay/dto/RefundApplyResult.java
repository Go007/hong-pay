package com.hong.pay.dto;

import com.hong.pay.enums.RefundStatus;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * <br>退款请求结果</br>
 *
 */
public class RefundApplyResult implements Serializable {

    private static final long serialVersionUID = -4093487649977613628L;

    /**
     *  业务订单类型
     */
    private int orderType;

    /**
     * 业务订单号
     */
    private String orderNo;

    /**
     * 订单金额
     */
    private Long orderAmt;

    /**
     * 第三方支付交易号
     */
    private String thirdTradeNo;

    /**
     * 退款号
     */
    private String refundId;

    /**
     * 第三方退款号
     */
    private String thirdRefundNo;

    /**
     * 交易时间
     */
    private Date tradeTime;

    /**
     * 退款状态
     */
    private RefundStatus status;

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

    public int getOrderType() {
        return orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
