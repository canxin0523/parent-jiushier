package com.shopxx.pojo;

import java.io.Serializable;

public class XxRoleAuthority  implements Serializable{
    private static final long serialVersionUID = 3605297572020230737L;

	private Long role;

    private String authorities;

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities == null ? null : authorities.trim();
    }
}