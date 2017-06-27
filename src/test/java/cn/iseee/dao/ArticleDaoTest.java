package cn.iseee.dao;

import cn.iseee.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by popla on 2017/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ArticleDaoTest {

    @Resource
    private ArticleDao articleDao;
    @Test
    public void insertArticle() throws Exception {
        Article article = new Article();
        article.setName("新中国成立");
        article.setContent("新中国成立19491001".getBytes());
        article.setCreateTime(new Date());
        System.out.println(article);
        articleDao.insertArticle(article);
        System.out.println(article.getArticleId());
    }

    @Test
    public void deleteArticle() throws Exception {
        long id = 1;
        int deleteCount = articleDao.deleteArticle(id);
        System.out.println(deleteCount);
    }

    @Test
    public void updateArticle() throws Exception {
        Article article = new Article();
        article.setArticleId(100001);
        article.setName("爱我中华");
        article.setContent("我爱我亲爱的祖国".getBytes());
        article.setCreateTime(new Date());
        System.out.println(article);
        articleDao.insertArticle(article);
        System.out.println(article.getArticleId());
    }

    @Test
    public void queryById() throws Exception {
        long id = 10000;
        Map<String, Object> article = articleDao.queryById(id);
//        System.out.println(article.getName());
    }

}