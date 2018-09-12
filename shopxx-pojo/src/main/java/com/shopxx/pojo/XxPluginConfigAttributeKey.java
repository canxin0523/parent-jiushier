package com.shopxx.pojo;
import java.io.Serializable;

public class XxPluginConfigAttributeKey  implements Serializable{
    private static final long serialVersionUID = 2952071758451402073L;

	private Long pluginConfig;

    private String attributesKey;

    public Long getPluginConfig() {
        return pluginConfig;
    }

    public void setPluginConfig(Long pluginConfig) {
        this.pluginConfig = pluginConfig;
    }

    public String getAttributesKey() {
        return attributesKey;
    }

    public void setAttributesKey(String attributesKey) {
        this.attributesKey = attributesKey == null ? null : attributesKey.trim();
    }
}