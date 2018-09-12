package com.shopxx.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxMemberAttribute  implements Serializable{
    private static final long serialVersionUID = -7310566160123426937L;

	private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private Boolean isEnabled;

    private Boolean isRequired;

    private String name;

    private Integer propertyIndex;

    private Integer type;

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

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPropertyIndex() {
        return propertyIndex;
    }

    public void setPropertyIndex(Integer propertyIndex) {
        this.propertyIndex = propertyIndex;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}