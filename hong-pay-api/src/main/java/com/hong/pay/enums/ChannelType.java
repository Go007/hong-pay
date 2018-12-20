package com.hong.pay.enums;

/** 
* @ClassName: ChannelType 
* @Description: 支付渠道类型 
*/
public enum ChannelType {

    //支付宝PC_WEB
    ALIPAY_WEB("ALIPAY", "支付宝", "WEB", "com.dafycredit.pay.alipay.AlipayServiceImpl"),
    //支付宝APP
    ALIPAY_APP("ALIPAY", "支付宝", "APP", "com.dafycredit.pay.alipay.AlipayServiceImpl"),
    //支付宝H5
    ALIPAY_WAP("ALIPAY", "支付宝", "WAP", "com.dafycredit.pay.alipay.AlipayServiceImpl"),
    // 支付宝扫码支付
    ALIPAY_SCAN("ALIPAY", "支付宝", "SCAN", "com.dafycredit.pay.alipay.AlipayServiceImpl"),

    //微信PC_WEB
    WECHAT_NATIVE("WECHATPAY", "微信", "NATIVE", "com.dafycredit.pay.wechat.WechatpayServiceImpl"),
    //微信APP
    WECHAT_APP("WECHATPAY", "微信", "APP", "com.dafycredit.pay.wechat.WechatpayServiceImpl"),
    //微信WAP
    WECHAT_WAP("WECHATPAY", "微信", "WAP", "com.dafycredit.pay.wechat.WechatpayServiceImpl"),
    //微信公众号
    WECHAT_JSAPI("WECHATPAY", "微信", "JSAPI", "com.dafycredit.pay.wechat.WechatpayServiceImpl"),
    // 微信扫码支付
    WECHAT_SCAN("WECHATPAY", "微信", "SCAN", "com.dafycredit.pay.wechat.WechatpayServiceImpl"),
    // 微信H5支付
    WECHAT_H5("WECHATPAY", "微信", "H5", "com.dafycredit.pay.wechat.WechatpayServiceImpl"),

    // QQ公众号
    QQ_JSAPI("QQPAY", "QQ", "JSAPI", "com.dafycredit.pay.qq.QqPayServiceImpl"),

    // 京东H5
    JDPAY_WAP("JDPAY", "京东", "WAP", "com.dafycredit.pay.jd.JdPayServiceImpl"),

    // 京东H5 APP
    JDPAY_APPWAP("JDPAY", "京东", "WAP", "com.dafycredit.pay.jd.JdPayServiceImpl");

    /**
     * 渠道
     */
    private String channel;

    /**
     * 渠道名称
     */
    private String channelName;

    /**
     * 类型
     */
    private String type;

    /**
     * 类全限定名
     */
    private String classFullName;

    private ChannelType(String channel, String channelName, String type, String classFullName) {
        this.channel = channel;
        this.channelName = channelName;
        this.type = type;
        this.classFullName = classFullName;
    }

    public String channel() {
        return this.channel;
    }

    public String channelName() {
        return this.channelName;
    }

    public String type() {
        return this.type;
    }

    public String classFullName() {
        return this.classFullName;
    }

    public static ChannelType from(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("ChannelType name can not be empty.");
        }
        return Enum.valueOf(ChannelType.class, name);
    }

    public static void main(String[] args) {
        System.out.println(ChannelType.QQ_JSAPI.name());
        System.out.println(ChannelType.from("QQ_JSAPI").name());
    }
}
