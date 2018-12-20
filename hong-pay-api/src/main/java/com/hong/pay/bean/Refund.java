package com.hong.pay.bean;

import java.io.Serializable;

/**
 * <br>退款流水</br>
 */
public class Refund implements Serializable {

    private static final long serialVersionUID = 7179532716502223005L;

    private Long id;

    /**
     * 退款ID
     * */
    private String refundId;

    /**
     * 支付ID
     */
    private String payId;

    /**
     * 退款类型：1商城；2还款；
     */
    private Integer refundType;

    /**
     *退款单号：商城订单号
     */
    private String refundNo;

    /**
     * 退款单金额
     */
    private Long refundAmt;

    /**
     * 退款费率
     */
    private Integer refundRate;

    /**
     * 退款原因
     */
    private String refundReason;

    /**
     * 第三方退款单号
     */
    private String thirdRefundNo;

    /**
     * 退款状态：1退款处理中；2退款成功；3退款失败；
     */
    private Integer status;

    /**
     *  备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 交易时间
     */
    private Long tradeTime;

    /**
     * 重试次数
     */
    private Integer retryCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo == null ? null : refundNo.trim();
    }

    public Long getRefundAmt() {
        return refundAmt;
    }

    public void setRefundAmt(Long refundAmt) {
        this.refundAmt = refundAmt;
    }

    public Integer getRefundRate() {
        return refundRate;
    }

    public void setRefundRate(Integer refundRate) {
        this.refundRate = refundRate;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    public String getThirdRefundNo() {
        return thirdRefundNo;
    }

    public void setThirdRefundNo(String thirdRefundNo) {
        this.thirdRefundNo = thirdRefundNo == null ? null : thirdRefundNo.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String rmark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Long tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }
}
