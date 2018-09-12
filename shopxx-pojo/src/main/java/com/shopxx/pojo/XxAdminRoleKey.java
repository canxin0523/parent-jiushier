package com.shopxx.pojo;

import java.io.Serializable;

public class XxAdminRoleKey  implements Serializable{
    private static final long serialVersionUID = 8099058752698070765L;

	private Long admins;

    private Long roles;

    public Long getAdmins() {
        return admins;
    }

    public void setAdmins(Long admins) {
        this.admins = admins;
    }

    public Long getRoles() {
        return roles;
    }

    public void setRoles(Long roles) {
        this.roles = roles;
    }
}