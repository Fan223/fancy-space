package fan.fancy.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.converter.BlogConverter;
import fan.fancy.blog.pojo.dto.CategoryDTO;
import fan.fancy.blog.pojo.entity.CategoryDO;
import fan.fancy.blog.pojo.query.CategoryQuery;
import fan.fancy.blog.pojo.vo.CategoryVO;
import fan.fancy.blog.service.CategoryService;
import fan.fancy.toolkit.builder.TreeBuilder;
import fan.fancy.toolkit.http.Response;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 博客分类控制器.
 *
 * @author Fan
 */
@RestController
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
        List<CategoryDO> categoryDOList = categoryService.list(query);
        List<CategoryVO> categories = blogConverter.convertCategories(categoryDOList);
        List<CategoryVO> categoryTree = TreeBuilder.builder(categories, CategoryVO::getId, CategoryVO::getParentId, CategoryVO::getChildren).build();
        return Response.success(categoryTree);
    }

    @PostMapping
    public Response<Integer> create(@RequestBody CategoryDTO categoryDTO) {
        CategoryDO categoryDO = blogConverter.convertCategory(categoryDTO);
        return Response.success(categoryService.create(categoryDO));
    }

    @PutMapping("/{id}")
    public Response<Integer> update(@PathVariable String id, @RequestBody CategoryDTO categoryDTO) {
        if (!id.equals(categoryDTO.getId())) {
            return Response.fail("数据不匹配");
        }
        CategoryDO categoryDO = blogConverter.convertCategory(categoryDTO);
        return Response.success(categoryService.update(categoryDO));
    }

    @DeleteMapping("/{id}")
    public Response<Integer> deleteById(@PathVariable String id) {
        return Response.success(categoryService.deleteById(id));
    }

    @DeleteMapping
    public Response<Integer> deleteByIds(@RequestParam List<String> ids) {
        return Response.success(categoryService.deleteByIds(ids));
    }
}
