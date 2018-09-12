package com.shopxx.pojo;

import java.io.Serializable;

public class XxPromotionProductKey  implements Serializable{
    private static final long serialVersionUID = -1131455479789140216L;

	private Long promotions;

    private Long products;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }
}