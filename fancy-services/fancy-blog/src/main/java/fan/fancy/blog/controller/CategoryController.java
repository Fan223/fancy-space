package fan.fancy.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.converter.BlogConverter;
import fan.fancy.blog.pojo.dto.ArticleDTO;
import fan.fancy.blog.pojo.entity.CategoryDO;
import fan.fancy.blog.pojo.query.CategoryQuery;
import fan.fancy.blog.pojo.vo.CategoryVO;
import fan.fancy.blog.service.CategoryService;
import fan.fancy.toolkit.http.Response;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 博客分类控制器.
 *
 * @author Fan
 */
@Controller
@RequestMapping("/blog/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    private final BlogConverter blogConverter;

    @GetMapping
    public Response<Page<CategoryVO>> page(CategoryQuery query) {
        Page<CategoryDO> categories = categoryService.page(query);
        return Response.success(blogConverter.convertCategories(categories));
    }

    @GetMapping("/list")
    public Response<List<CategoryVO>> list(CategoryQuery query) {
        List<CategoryDO> categories = categoryService.list(query);
        return Response.success(blogConverter.convertCategories(categories));
    }

    @PostMapping
    public Response<Void> create(@RequestBody ArticleDTO articleDTO) {
        return Response.success();
    }

    @PutMapping("/{id}")
    public Response<Void> update(@PathVariable Long id, @RequestBody ArticleDTO articleDTO) {
        return Response.success();
    }

    @DeleteMapping
    public Response<Void> deleteBatch(@RequestParam List<Long> ids) {
        return Response.success();
    }
}
