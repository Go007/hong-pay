package com.hong.pay.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * <br>支付通知回调url配置类</br>
 *
 */
@Component
@PropertySource(value = {"classpath:${spring.profiles.active}/config.properties"},encoding="UTF-8")
@ConfigurationProperties(prefix = "wechatpay")
public class WechatPayConfig {

    public static String gateWay;
    public static String appId;
    public static String notifyUrl;
    public static String returnUrl;

    public static void setGateWay(String gateWay) {
        WechatPayConfig.gateWay = gateWay;
    }

    public static void setAppId(String appId) {
        WechatPayConfig.appId = appId;
    }

    public static void setNotifyUrl(String notifyUrl) {
        WechatPayConfig.notifyUrl = notifyUrl;
    }

    public static void setReturnUrl(String returnUrl) {
        WechatPayConfig.returnUrl = returnUrl;
    }
}
