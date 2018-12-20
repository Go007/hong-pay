package com.hong.pay.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * <br>支付请求结果数据传输对象类</br>
 */
public class PayApplyResult implements Serializable {

    private static final long serialVersionUID = 7586296160311748495L;

    /**
     * 与第三方支付交互id
     */
    private String payId;

    /**
     * 支付类型
     */
    private String channelType;

    /**
     * 响应到客户端数据（如JSON或html form）
     */
    private String response;

    public PayApplyResult() {
    }

    public PayApplyResult(String response) {
        this.response = response;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
