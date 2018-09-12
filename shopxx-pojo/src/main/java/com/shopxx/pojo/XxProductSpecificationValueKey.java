package com.shopxx.pojo;

import java.io.Serializable;

public class XxProductSpecificationValueKey  implements Serializable{
    private static final long serialVersionUID = 4743499192920781894L;

	private Long products;

    private Long specificationValues;

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    public Long getSpecificationValues() {
        return specificationValues;
    }

    public void setSpecificationValues(Long specificationValues) {
        this.specificationValues = specificationValues;
    }
}