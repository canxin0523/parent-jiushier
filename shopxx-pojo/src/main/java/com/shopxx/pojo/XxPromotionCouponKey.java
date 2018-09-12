package com.shopxx.pojo;

import java.io.Serializable;

public class XxPromotionCouponKey  implements Serializable{
    private static final long serialVersionUID = -2495830600157931019L;

	private Long promotions;

    private Long coupons;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getCoupons() {
        return coupons;
    }

    public void setCoupons(Long coupons) {
        this.coupons = coupons;
    }
}