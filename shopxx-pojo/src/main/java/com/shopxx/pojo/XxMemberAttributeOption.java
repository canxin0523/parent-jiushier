package com.shopxx.pojo;

import java.io.Serializable;

public class XxMemberAttributeOption  implements Serializable{
    private static final long serialVersionUID = -6336359284614103459L;

	private Long memberAttribute;

    private String options;

    public Long getMemberAttribute() {
        return memberAttribute;
    }

    public void setMemberAttribute(Long memberAttribute) {
        this.memberAttribute = memberAttribute;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }
}