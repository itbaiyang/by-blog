package cn.iseee.web;

import cn.iseee.entity.Article;
import cn.iseee.service.ArticleService;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by popla on 2017/6/26.
 */
@Controller
@RequestMapping(value = "/blog/")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping(value = "insert")
    @ResponseBody
    public Long insert(HttpServletRequest request, @ModelAttribute Article article){

        article.setCreateTime(new Date());
        Long result = articleService.insertArticle(article);
        return result;
    }

    @DeleteMapping(value = "delete")
    public int delete(@RequestParam("articleId") Long articleId){
        int result = articleService.deleteArticle(articleId);
        return result;
    }

    @PutMapping(value = "update")
    @ResponseBody
    public Long update(HttpServletRequest request, @ModelAttribute Article article){
        article.setCreateTime(new Date());
        Long result = articleService.updateArticle(article);
        return result;
    }

    @GetMapping(value = "list", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String list(int offset, int limit) {
        String result = articleService.getArticleList(offset, limit);
//        String result = JSONObject.toJSONString(articleList);
        return result;
    }

    @GetMapping(value = "one", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String one(Long articleId) {
        String result = null;
        result = articleService.queryById(articleId);
        System.out.println(result);
        return result;
    }
}
