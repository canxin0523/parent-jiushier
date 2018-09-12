package com.shopxx.pojo;
import java.io.Serializable;

public class XxMemberFavoriteProductKey  implements Serializable{
    private static final long serialVersionUID = -4893704710340325913L;

	private Long favoriteMembers;

    private Long favoriteProducts;

    public Long getFavoriteMembers() {
        return favoriteMembers;
    }

    public void setFavoriteMembers(Long favoriteMembers) {
        this.favoriteMembers = favoriteMembers;
    }

    public Long getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(Long favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }
}