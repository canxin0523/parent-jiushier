package com.shopxx.pojo;

import java.io.Serializable;

public class XxPromotionMemberRankKey  implements Serializable{
    private static final long serialVersionUID = -2385425394239405691L;

	private Long promotions;

    private Long memberRanks;

    public Long getPromotions() {
        return promotions;
    }

    public void setPromotions(Long promotions) {
        this.promotions = promotions;
    }

    public Long getMemberRanks() {
        return memberRanks;
    }

    public void setMemberRanks(Long memberRanks) {
        this.memberRanks = memberRanks;
    }
}