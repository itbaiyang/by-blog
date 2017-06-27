package cn.iseee.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by popla on 2017/6/23.
 */
public class Article implements Serializable {

    private long articleId;

    private String name;

    private Date createTime;

    private byte[] content;

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
