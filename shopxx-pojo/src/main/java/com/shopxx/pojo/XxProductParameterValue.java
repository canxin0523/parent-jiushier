package com.shopxx.pojo;

import java.io.Serializable;

public class XxProductParameterValue extends XxProductParameterValueKey  implements Serializable{
    private static final long serialVersionUID = 7152764482398352412L;
	private String parameterValue;

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue == null ? null : parameterValue.trim();
    }
}