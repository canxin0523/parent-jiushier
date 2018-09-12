package com.shopxx.pojo;

import java.io.Serializable;

public class XxProductCategoryBrandKey  implements Serializable{
    private static final long serialVersionUID = 5977341520695553901L;

	private Long productCategories;

    private Long brands;

    public Long getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(Long productCategories) {
        this.productCategories = productCategories;
    }

    public Long getBrands() {
        return brands;
    }

    public void setBrands(Long brands) {
        this.brands = brands;
    }
}