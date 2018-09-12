package com.shopxx.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XxPromotion  implements Serializable{
    private static final long serialVersionUID = 4654022713540489529L;

	private Long id;

    private Date createDate;

    private Date modifyDate;

    private Integer orders;

    private Date beginDate;

    private Date endDate;

    private BigDecimal endPrice;

    private Boolean isCouponAllowed;

    private Boolean isFreeShipping;

    private String name;

    private Integer pointOperator;

    private BigDecimal pointValue;

    private Integer priceOperator;

    private BigDecimal priceValue;

    private BigDecimal startPrice;

    private String title;

    private String introduction;

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

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(BigDecimal endPrice) {
        this.endPrice = endPrice;
    }

    public Boolean getIsCouponAllowed() {
        return isCouponAllowed;
    }

    public void setIsCouponAllowed(Boolean isCouponAllowed) {
        this.isCouponAllowed = isCouponAllowed;
    }

    public Boolean getIsFreeShipping() {
        return isFreeShipping;
    }

    public void setIsFreeShipping(Boolean isFreeShipping) {
        this.isFreeShipping = isFreeShipping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPointOperator() {
        return pointOperator;
    }

    public void setPointOperator(Integer pointOperator) {
        this.pointOperator = pointOperator;
    }

    public BigDecimal getPointValue() {
        return pointValue;
    }

    public void setPointValue(BigDecimal pointValue) {
        this.pointValue = pointValue;
    }

    public Integer getPriceOperator() {
        return priceOperator;
    }

    public void setPriceOperator(Integer priceOperator) {
        this.priceOperator = priceOperator;
    }

    public BigDecimal getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(BigDecimal priceValue) {
        this.priceValue = priceValue;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}