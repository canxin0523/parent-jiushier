package com.shopxx.pojo;

import java.io.Serializable;

public class XxProductSpecificationKey  implements Serializable{
    private static final long serialVersionUID = 2246714547734855399L;

	private Long products;

    private Long specifications;

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    public Long getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Long specifications) {
        this.specifications = specifications;
    }
}