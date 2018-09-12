package com.shopxx.pojo;

import java.io.Serializable;

public class XxProductMemberPriceKey  implements Serializable{
    private static final long serialVersionUID = -7759480894401206869L;

	private Long product;

    private Long memberPriceKey;

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Long getMemberPriceKey() {
        return memberPriceKey;
    }

    public void setMemberPriceKey(Long memberPriceKey) {
        this.memberPriceKey = memberPriceKey;
    }
}