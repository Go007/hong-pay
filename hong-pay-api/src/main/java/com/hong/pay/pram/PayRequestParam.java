package com.hong.pay.pram;

/**
 * <br>支付请求参数类</br>
 *
 */
public class PayRequestParam {
    /**
     * 支付渠道
     */
    private String channelType;

    /**
     * 业务类型：1购物； 2还款；
     */
    private Integer bizType;

    /**
     * 商品信息
     */
    private String body;

    /**
     * 订单编号
     */
    private String orderNo;



}
