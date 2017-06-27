package cn.iseee.dao;

import cn.iseee.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by popla on 2017/6/23.
 */
public interface ArticleDao {

    long insertArticle(Article article);

    int deleteArticle(long articleId);

    long updateArticle(Article article);

    Map<String, Object> queryById(long articleId);

    List<Map<String, Object>> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    Integer articleListCount();
}
