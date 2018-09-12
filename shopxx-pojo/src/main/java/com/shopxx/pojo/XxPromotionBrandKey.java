package com.shopxx.pojo;

import java.io.Serializable;

public class XxPromotionBrandKey  implements Serializable{
    private static final long serialVersionUID = -3808067758139935434L;

	private Long promotions;

    private Long brands;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getBrands() {
        return brands;
    }

    public void setBrands(Long brands) {
        this.brands = brands;
    }
}