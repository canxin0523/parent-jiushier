package com.shopxx.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxNavigation  implements Serializable{
    private static final long serialVersionUID = -2508151342100123908L;

	private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private Boolean isBlankTarget;

    private String name;

    private Integer position;

    private String url;

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

    public Boolean getIsBlankTarget() {
        return isBlankTarget;
    }

    public void setIsBlankTarget(Boolean isBlankTarget) {
        this.isBlankTarget = isBlankTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}