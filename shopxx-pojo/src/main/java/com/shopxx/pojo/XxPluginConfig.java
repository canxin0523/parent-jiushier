package com.shopxx.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxPluginConfig  implements Serializable{
    private static final long serialVersionUID = -4473176924308525522L;

	private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private Boolean isEnabled;

    private String pluginId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId == null ? null : pluginId.trim();
    }
}