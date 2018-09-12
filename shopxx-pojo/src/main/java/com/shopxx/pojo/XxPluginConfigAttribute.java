package com.shopxx.pojo;

import java.io.Serializable;

public class XxPluginConfigAttribute extends XxPluginConfigAttributeKey  implements Serializable{
    private static final long serialVersionUID = 7932907822485330213L;
	private String attributes;

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes == null ? null : attributes.trim();
    }
}