package cn.iseee.service.impl;

import cn.iseee.dao.ArticleDao;
import cn.iseee.dto.ArticleJson;
import cn.iseee.entity.Article;
import cn.iseee.service.ArticleService;
import cn.iseee.util.Page;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by popla on 2017/6/26.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public long insertArticle(Article article) {

        long res = articleDao.insertArticle(article);
        return res;
    }

    public int deleteArticle(long articleId) {

        int res = articleDao.deleteArticle(articleId);
        return res;
    }

    public long updateArticle(Article article) {

        long res = articleDao.updateArticle(article);
        return res;
    }

    public String getArticleList(int offset, int limit) {
        String json = null;
        try {
            List<Map<String, Object>> articleList = articleDao.queryAll(offset, limit);
            for (Map<String, Object> temp : articleList) {
                byte[] bytes = (byte[]) temp.get("content");
                String contentFont = "GBK";
                temp.put("content", new String(bytes == null || bytes.length == 0 ? new byte[] {} : bytes,
                        contentFont));
            }
            Integer articleListCount = articleDao.articleListCount();
            Page page = new Page(articleList, offset, limit, articleListCount);
            json = JSONObject.toJSONString(page);
        }catch (Exception e){

             json = null;
        }

        return json;
    }

    public String queryById(long articleId) {
        String json = null;
        try {
            Map<String, Object> result = articleDao.queryById(articleId);
            byte[] bytes = (byte[]) result.get("content");
            String contentFont = "GBK";
            result.put("content",
                    new String(bytes == null || bytes.length == 0 ? new byte[] {} : bytes,
                            contentFont));
            json = JSONObject.toJSONString(result);
        } catch (Exception e){
            e.printStackTrace();
        }
        return json;
    }
}
