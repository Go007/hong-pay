package com.hong.pay.enums;

/** 
* @ClassName: PaymentStatus 
* @Description:  支付状态 
*
*/
public enum PaymentStatus {
    // 支付状态
    WAITING(0, "待买家付款"), 
    SUCCESS(1, "支付成功"), 
    FAILURE(2, "支付失败"),
    PENDING(3, "待卖家收款"),
    CLOSED(4, "交易已关闭"), 
    TRADE_NOT_EXIST(5, "交易不存在"),
    FINISHED(6, "交易完成--不可退款");

    private int status;
    private String desc;

    private PaymentStatus(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public int status() {
        return status;
    }

    public String desc() {
        return desc;
    }

    public static PaymentStatus from(int status) {
        for (PaymentStatus payment : PaymentStatus.values()) {
            if (payment.status == status) {
                return payment;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(PaymentStatus.SUCCESS.toString());
    }
}
