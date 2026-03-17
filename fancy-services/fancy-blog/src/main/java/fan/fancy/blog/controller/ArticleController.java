package fan.fancy.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.converter.BlogConverter;
import fan.fancy.blog.pojo.dto.ArticleDTO;
import fan.fancy.blog.pojo.entity.ArticleDO;
import fan.fancy.blog.pojo.query.ArticleQuery;
import fan.fancy.blog.pojo.vo.ArticleVO;
import fan.fancy.blog.service.ArticleService;
import fan.fancy.toolkit.http.Response;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 博客文章控制器.
 *
 * @author Fan
 */
@RestController
@RequestMapping("/blog/articles")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    private final BlogConverter blogConverter;

    @GetMapping
    public Response<Page<ArticleVO>> page(ArticleQuery query) {
        Page<ArticleDO> articles = articleService.page(query);
        return Response.success(blogConverter.convertArticles(articles));
    }

    @GetMapping("/{id}")
    public Response<ArticleVO> getById(@PathVariable String id) {
        ArticleDO articleDO = articleService.getById(id);
        return Response.success(blogConverter.convertArticle(articleDO));
    }

    @PostMapping("/upsert")
    public Response<ArticleVO> upsert(@RequestBody ArticleDTO articleDTO) {
        ArticleDO articleDO = blogConverter.convertArticle(articleDTO);
        ArticleDO upsert = articleService.upsert(articleDO);
        return Response.success(blogConverter.convertArticle(upsert));
    }

    @DeleteMapping("/{id}")
    public Response<Integer> deleteById(@PathVariable String id) {
        return Response.success(articleService.deleteById(id));
    }

    @DeleteMapping
    public Response<Integer> deleteByIds(@RequestParam List<String> ids) {
        return Response.success(articleService.deleteByIds(ids));
    }
}
