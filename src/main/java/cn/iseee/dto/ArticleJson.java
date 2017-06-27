package cn.iseee.dto;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by popla on 2017/6/27.
 */
public class ArticleJson {

    private long articleId;

    private String name;

    private Date createTime;

    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleJson{" +
                "articleId=" + articleId +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                '}';
    }
}
