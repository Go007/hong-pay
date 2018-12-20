package com.hong.pay.dto;

import com.hong.pay.enums.RefundStatus;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <br>退款查询结果</br>
 *
 * @author  516649
 * @email   zhouqian@dafycredit.com
 * @date    2018年1月19日 上午11:29:10
 * @version 1.0
 * @since   1.0
 */
public class RefundQueryResult implements Serializable {

    private static final long serialVersionUID = -8566163176405242484L;

    /**
     * 支付号
     */
    private String payId;

    /**
     * 订单类型
     */
    private int orderType;

    /**
     * 业务订单号
     */
    private String orderNo;

    /**
     * 第三方交易号
     */
    private String thirdTradeNo;

    /**
     * 订单金额
     */
    private Long orderAmt;

    /**
     * 退款明细
     */
    private List<RefundDetail> details;

    public String getPayId() {
        return payId;
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public Long getOrderAmt() {
        return orderAmt;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public void setOrderAmt(Long orderAmt) {
        this.orderAmt = orderAmt;
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

    public List<RefundDetail> getDetails() {
        return details;
    }

    public void setDetails(List<RefundDetail> details) {
        this.details = details;
    }

    /**
     * 退款详情
     */
    public static class RefundDetail {

        private String refundId; // 退款号
        private long refundAmt; // 退款金额
        private String thirdRefundNo; // 第三方退款号
        private Date tradeTime; // 交易时间
        private RefundStatus status; // 退款状态

        public String getRefundId() {
            return refundId;
        }

        public long getRefundAmt() {
            return refundAmt;
        }

        public String getThirdRefundNo() {
            return thirdRefundNo;
        }

        public Date getTradeTime() {
            return tradeTime;
        }

        public RefundStatus getStatus() {
            return status;
        }

        public void setRefundId(String refundId) {
            this.refundId = refundId;
        }

        public void setRefundAmt(long refundAmt) {
            this.refundAmt = refundAmt;
        }

        public void setThirdRefundNo(String thirdRefundNo) {
            this.thirdRefundNo = thirdRefundNo;
        }

        public void setTradeTime(Date tradeTime) {
            this.tradeTime = tradeTime;
        }

        public void setStatus(RefundStatus status) {
            this.status = status;
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
