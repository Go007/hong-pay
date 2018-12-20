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
@ConfigurationProperties(prefix = "alipay")
public class AliPayConfig {

    public static String gateWay;
    public static String payAppId;
    public static String appPrivateKey;
    public static String appPublicKey;
    public static String pubKey;
    public static String notifyUrl;

    public static void setGateWay(String gateWay) {
        AliPayConfig.gateWay = gateWay;
    }

    public static void setPayAppId(String payAppId) {
        AliPayConfig.payAppId = payAppId;
    }

    public static void setAppPrivateKey(String appPrivateKey) {
        AliPayConfig.appPrivateKey = appPrivateKey;
    }

    public static void setAppPublicKey(String appPublicKey) {
        AliPayConfig.appPublicKey = appPublicKey;
    }

    public static void setNotifyUrl(String notifyUrl) {
        AliPayConfig.notifyUrl = notifyUrl;
    }

    public static void setPubKey(String pubKey) {
        AliPayConfig.pubKey = pubKey;
    }
}
