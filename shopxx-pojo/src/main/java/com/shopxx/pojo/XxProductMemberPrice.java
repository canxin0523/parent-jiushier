package com.shopxx.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class XxProductMemberPrice extends XxProductMemberPriceKey  implements Serializable{
    private static final long serialVersionUID = -92814218609146671L;
	private BigDecimal memberPrice;

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }
}