package com.shopxx.pojo;

import java.io.Serializable;
import java.util.Date;

public class XxGoods  implements Serializable{
    private static final long serialVersionUID = -2144649981191664020L;

	private Long id;

    private Date createDate;

    private Date modifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}