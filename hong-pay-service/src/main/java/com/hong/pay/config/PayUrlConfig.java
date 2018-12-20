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
@ConfigurationProperties
public class PayUrlConfig {


}
