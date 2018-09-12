package com.shopxx.pojo;
import java.io.Serializable;

public class XxArticleTagKey  implements Serializable{
    private static final long serialVersionUID = 5859217452821304216L;

	private Long articles;

    private Long tags;

    public Long getArticles() {
        return articles;
    }

    public void setArticles(Long articles) {
        this.articles = articles;
    }

    public Long getTags() {
        return tags;
    }

    public void setTags(Long tags) {
        this.tags = tags;
    }
}