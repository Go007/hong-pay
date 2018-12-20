package com.hong.pay.common;

public class Constants {

    /**
     * 渠道类型
     */
    public static final String PARAM_CHANNEL_TYPE = "channelType";

    /**
     * 支付ID（与第三方支付交互,由id中心生成）
     */
    public static final String PARAM_PAY_ID = "payId";

    /**
     * success
     */
    public static final String PARAM_SUCCESS = "success";
    
    /**
     * 订单支付金额
     */
    public static final String PARAM_ORDER_AMT = "orderAmt";

    /**
     * 用户端IP（非必传）
     */
    public static final String PARAM_CLIENT_IP = "clientIp";

    /**
     * 自定义的附加参数（非必传）
     */
    public static final String PARAM_ATTACH_DATA = "attachData";

    /**
     * 第三方交易号
     */
    public static final String PARAM_THIRD_TRADE_NO = "thirdTradeNo";

    /**
     * 超时时间
     */
    public static final String PARAM_EXPIRE_TIME = "expireTime";

    /**
     * 支付异步通知
     */
    public static final String PARAM_PAYMENT_NOTIFY_URL = "paymentNotifyUrl";

    /**
     * 支付页面跳转
     */
    public static final String PARAM_PAYMENT_RETURN_URL = "paymentReturnUrl";

    /**
     * 微信支付成功页面跳转
     */
    public static final String PARAM_SUCC_PATH = "successPath";

    /**
     * 微信支付失败页面跳转
     */
    public static final String PARAM_FAIL_PATH = "failPath";

    /**
     * 退款异步通知.
     */
    public static final String PARAM_REFUND_NOTIFY_URL = "refundNotifyUrl";

    // 其它参数
    /**
     *  ali web银行支付
     */
    public static final String PARAM_ALI_PAYMETHOD = "paymethod";

    /**
     * ali web银行支付
     */
    public static final String PARAM_ALI_DEFAULTBANK = "defaultbank";

    /**
     * 手Q支付买方qq号
     */
    public static final String PARAM_QPAY_QQ = "purchaserQQ";

    /**
     *  用户标识：trade_type=JSAPI，此参数必传，用户在商户appid下的唯一标识
     */
    public static final String PARAM_OPEN_ID = "openId";

    /**
     * 商品信息
     */
    public static final String PARAM_GOODS_BODY = "body";

    /**
     * 创建时间
     */
    public static final String PARAM_CREATE_TM = "createTime";

    /**
     * 交易时间
     */
    public static final String PARAM_TRADE_TM = "tradeTime";

    /**
     * 外部参数
     */
    public static final String PARAM_EXTRA_DATA = "extraData";

    /**
     * 备注
     */
    public static final String PARAM_REMARK = "remark";

    /**
     * 用户id
     */
    public static final String PARAM_USER_ID = "userId";

    /**
     * 账户id
     */
    public static final String PARAM_ACCOUNT_ID = "accountId";

    /**
     *  来源
     */
    public static final String PARAM_SOURCE = "source";

    /**
     * 业务类型：1购物； 2还款；
     */
    public static final String PARAM_BIZ_TYPE = "bizType";

    /**
     * data
     */
    public static final String PARAM_DATA = "data";

    /**
     * 退款参数名
     */

    /**
     * 退款单号
     */
    public static final String PARAM_REFUND_ID = "refundId";

    /**
     * 退款金额
     */
    public static final String PARAM_REFUND_AMT = "refundAmt";

    /**
     * 退款费率
     */
    public static final String PARAM_REFUND_RATE = "refundRate";

    /**
     * 退款原因
     */
    public static final String PARAM_REFUND_REASON = "refundReason";

    /**
     * 第三方退款单号
     */
    public static final String PARAM_THIRD_REFUND_NO = "thirdRefundNo";

    /**
     * 第三方批次号，用于部分退款
     */
    public static final String PARAM_REFUND_BATCHID = "out_request_no";

    /**
     * 业务参数
     */

    /**
     * 订单编号
     */
    public static final String PARAM_ORDER_NO = "orderNo";

    public static final String PARAM_ORDER_TYPE = "orderType";

    public static final String PARAM_REFUND_TYPE = "refundType";

    public static final String PARAM_REFUND_NO = "refundNo";

    /**
     * 固定参数值
     */
    public static final String GOODS_SUBJECT = "即有商城";

    public static final String DEFAULT_DATE_FORMAT = "yyyyMMddHHmmss";

    /**
     * 商城公众号支付标识
     */
    public static final String PARAM_WECHAT_JS_PAY_FLAG = "inner_wechat_js_pay";
    
    
    /**
     * 状态
     * */
    public static final String PARAM_STATUS = "status";
    
    /**
     * 类型
     * */
    public static final String PARAM_TYPE = "type";
    
    /**
     * 微信支付
     * */
    public static final String PARAM_WECHAT_PAY = "wechatpay";
    
    /**
     * 京东支付
     * */
    public static final String PARAM_JD_PAY = "jdpay";
    
    /**
     * 支付宝支付
     * */
    public static final String PARAM_ALI_PAY = "alipay";
    
    /**
     * qq支付
     * */
    public static final String PARAM_QQ_PAY = "qqpay";

}
