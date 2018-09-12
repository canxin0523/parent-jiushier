package com.shopxx.pojo;

import java.io.Serializable;

public class XxLogWithBLOBs extends XxLog  implements Serializable{
    private static final long serialVersionUID = -1989127311707190778L;

	private String content;

    private String parameter;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }
}