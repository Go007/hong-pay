package com.hong.pay.enums;

/** 
* @ClassName: BizType 
* @Description: 业务类型定义 
*/
public enum BusinessType {

    // 业务类型
    SHOPPINGPAY(1, "G", "购物"),

    REPAYMENT(2, "H", "还款"),

    RECHARGE_CALL(3, "CHF", "充值电话"),

    RECHARGE_FLOW(4, "CLL", "充值流量"),

    PRE_CHARGE(5, "PRE", "前置费用"),;

    /**
     * 业务代号
     */
    private int code;

    /**
     * 业务字母代号    （这个字符会放到订单最前面  例如     H1000001 ：还款支付   G1000002：购物支付   ）
     */
    private String letter;

    /**
     * 业务描述
     */
    private String desc;

    BusinessType(int code, String letter, String desc) {
        this.code = code;
        this.setLetter(letter);
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public static BusinessType fromCode(int code) {
        for (BusinessType type : BusinessType.values()) {
            if (type.code == code) {
                return type;
            }
        }
        return null;
    }

}
