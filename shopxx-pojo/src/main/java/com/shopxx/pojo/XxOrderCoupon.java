package com.shopxx.pojo;

import java.io.Serializable;

public class XxOrderCoupon  implements Serializable{
    private static final long serialVersionUID = 1985516896681637171L;

	private Long orders;

    private Long coupons;

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCoupons() {
        return coupons;
    }

    public void setCoupons(Long coupons) {
        this.coupons = coupons;
    }
}