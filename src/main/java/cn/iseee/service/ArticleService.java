package cn.iseee.service;

import cn.iseee.entity.Article;

import java.util.List;

/**
 * Created by popla on 2017/6/26.
 */
public interface ArticleService {

    long insertArticle(Article article);

    int deleteArticle(long articleId);

    long updateArticle(Article article);

    String getArticleList(int offset, int limit);

    String queryById(long articleId);
}
