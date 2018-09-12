package com.shopxx.pojo;

import java.io.Serializable;

public class XxPromotionProductCategoryKey  implements Serializable{
    private static final long serialVersionUID = 491462265776829160L;

	private Long promotions;

    private Long productCategories;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(Long productCategories) {
        this.productCategories = productCategories;
    }
}