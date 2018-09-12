package com.shopxx.pojo;

import java.io.Serializable;

public class XxProductParameterValueKey  implements Serializable{
    private static final long serialVersionUID = -2227555568266555212L;

	private Long product;

    private Long parameterValueKey;

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Long getParameterValueKey() {
        return parameterValueKey;
    }

    public void setParameterValueKey(Long parameterValueKey) {
        this.parameterValueKey = parameterValueKey;
    }
}