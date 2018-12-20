package com.hong.pay.bean;

import java.io.Serializable;

/** 
* @ClassName: PayChannel 
* @Description: 支付渠道 
*/
public class PayChannel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 支付渠道
     * */
    private String channelType;

    /**
     * 渠道名称
     * */
    private String channelName;

    /**
     * 来源：Andriod；IOS；H5；
     * */
    private String source;

    /**
     *展示顺序
     * */
    private Integer orders;

    /**
     * 状态：0无效；1有效；
     * */
    private Integer status;

    /**
     * 详细描述
     * */
    private String description;

    /**
     * 创建时间
     * */
    private Long createTime;

    /**
     * 修改时间
     * */
    private Long updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
