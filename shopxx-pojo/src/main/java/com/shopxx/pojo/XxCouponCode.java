package com.shopxx.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxCouponCode  implements Serializable{
    private static final long serialVersionUID = -9050686469786400682L;

	private Long id;

    private Date createDate;

    private Date modifyDate;

    private String code;

    private Boolean isUsed;

    private Date usedDate;

    private Long coupon;

    private Long member;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public Date getUsedDate() {
        return usedDate;
    }

    public void setUsedDate(Date usedDate) {
        this.usedDate = usedDate;
    }

    public Long getCoupon() {
        return coupon;
    }

    public void setCoupon(Long coupon) {
        this.coupon = coupon;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }
}