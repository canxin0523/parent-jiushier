package com.shopxx.pojo;

import java.io.Serializable;

public class XxProductTagKey  implements Serializable{
    private static final long serialVersionUID = -3675639252859640748L;

	private Long products;

    private Long tags;

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    public Long getTags() {
        return tags;
    }

    public void setTags(Long tags) {
        this.tags = tags;
    }
}