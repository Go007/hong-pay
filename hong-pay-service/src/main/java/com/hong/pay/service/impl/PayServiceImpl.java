package com.hong.pay.service.impl;

import com.github.pagehelper.PageInfo;
import com.hong.common.bean.GenericResult;
import com.hong.common.log.LogAnnotation;
import com.hong.common.validate.ValidateFiled;
import com.hong.common.validate.ValidateGroup;
import com.hong.pay.bean.OrderBill;
import com.hong.pay.bean.PayChannel;
import com.hong.pay.bean.Payment;
import com.hong.pay.bean.Refund;
import com.hong.pay.config.AliPayConfig;
import com.hong.pay.config.WechatPayConfig;
import com.hong.pay.dto.*;
import com.hong.pay.enums.ChannelType;
import com.hong.pay.service.IPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

import static com.hong.pay.common.Constants.*;

/**
 * <br>支付请求门面类</br>
 * 因为存在微信/支付宝等不同的支付渠道,因此采取策略模式,
 * 由PayServiceImpl充当统一的门面类,根据客户端不同的支付渠道,
 * 自动路由到对应的支付方,发起支付请求
 */
@Service
public class PayServiceImpl implements IPayService {

    private static final Logger logger = LoggerFactory.getLogger(PayServiceImpl.class);


    @Override
    public GenericResult<List<PayChannel>> listPayChannelBySource(String source) {
        return null;
    }

    /**
     * 向第三方支付发起支付申请
     * <pre>
     *  {
     *    bizType=0,
     *    channelType=WECHAT_NATIVE,
     *    clientIp=183.16.194.73,
     *    orderAmt=1,
     *    orderNo=bizOrderNo,
     *    remark=remark001,
     *    source=IOS,
     *    userId=1
     *  }
     * </pre>
     *
     * @param params Map<String, String>
     * @return
     */
    @Override
    public GenericResult<PayApplyResult> pay(@RequestParam Map<String, String> params) {
        GenericResult<PayApplyResult> payResult;
        routePayReturnAndNotifyUrl(params);
        String orderNo = params.get(PARAM_ORDER_NO);

        return null;
    }

    private void routePayReturnAndNotifyUrl(Map<String, String> params) {
        ChannelType channelType = ChannelType.from(params.get(PARAM_CHANNEL_TYPE));
        switch (channelType) {
            case ALIPAY_WAP:
            case ALIPAY_APP:
            case ALIPAY_SCAN:
            case ALIPAY_WEB:
                params.put(PARAM_PAYMENT_NOTIFY_URL, AliPayConfig.notifyUrl);
                params.put(PARAM_PAYMENT_RETURN_URL, AliPayConfig.returnUrl);
                break;
            case WECHAT_APP:
            case WECHAT_JSAPI:
                params.put(PARAM_PAYMENT_NOTIFY_URL, WechatPayConfig.notifyUrl);
                params.put(PARAM_PAYMENT_RETURN_URL, WechatPayConfig.returnUrl);
                break;
            case WECHAT_SCAN:
                params.put(PARAM_PAYMENT_NOTIFY_URL, WechatPayConfig.notifyUrl);
                params.put(PARAM_PAYMENT_RETURN_URL, WechatPayConfig.returnUrl);
                break;
           /* case JDPAY_WAP:
                params.put(PARAM_PAYMENT_NOTIFY_URL, JD_NOTIFY_URL);
                params.put(PARAM_PAYMENT_RETURN_URL, JD_RETURN_URL);
                break;
            case JDPAY_APPWAP:
                params.put(PARAM_PAYMENT_NOTIFY_URL, JD_NOTIFY_URL);
                params.put(PARAM_PAYMENT_RETURN_URL, JD_APP_RETURN_URL);
                break;
            default:
                params.put(PARAM_PAYMENT_NOTIFY_URL, NOTIFY_URL);
                params.put(PARAM_PAYMENT_RETURN_URL, PAYMENT_RETURN);
                break;*/
        }
    }

    @Override
    public GenericResult<PayApplyResult> execPay(Map<String, String> params) {
        return null;
    }

    @Override
    public GenericResult<PayNotifyResult> payNotify(Map<String, String> params) {
        return null;
    }

    @Override
    public GenericResult<PayReturnResult> payReturn(Map<String, String> params) {
        return null;
    }

    @Override
    public GenericResult<RefundApplyResult> refund(Map<String, String> params) {
        return null;
    }

    @Override
    public GenericResult<RefundNotifyResult> refundNotify(Map<String, String> params) {
        return null;
    }

    @Override
    public GenericResult<PayQueryResult> payQuery(Map<String, String> params) {
        return null;
    }

    @Override
    public GenericResult<PayQueryResult> payQueryStatus(Map<String, String> params) {
        return null;
    }

    @Override
    public GenericResult<Payment> payQueryByOrderNo(String orderNo, Integer status) {
        return null;
    }

    @Override
    public GenericResult<Payment> payQueryByPayId(String payId) {
        return null;
    }

    @Override
    public GenericResult<RefundQueryResult> refundQuery(Map<String, String> params) {
        return null;
    }

    @Override
    public GenericResult<List<OrderBill>> orderBill(String originPayId, String... changePayIds) {
        return null;
    }

    @Override
    public GenericResult<PageInfo<Refund>> queryRefundsForPage(Map<String, ?> params) {
        return null;
    }
}
