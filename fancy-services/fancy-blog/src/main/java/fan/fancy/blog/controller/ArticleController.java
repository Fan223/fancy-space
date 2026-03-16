package fan.fancy.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.pojo.entity.ArticleDO;
import fan.fancy.blog.pojo.query.ArticleQuery;
import fan.fancy.blog.pojo.vo.ArticleVO;
import fan.fancy.blog.service.ArticleService;
import fan.fancy.toolkit.http.Response;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 博客文章控制器.
 *
 * @author Fan
 */
@Controller
@RequestMapping("/blog/articles")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public Response<Page<ArticleVO>> list(ArticleQuery query) {
        Page<ArticleDO> list = articleService.list(query);
        return Response.success();
    }

    @GetMapping("/{id}")
    public Response<ArticleVO> getById(@PathVariable Long id) {
        return Response.success(articleService.getById(id));
    }
}
