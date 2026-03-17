package fan.fancy.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.pojo.entity.CategoryDO;
import fan.fancy.blog.pojo.query.CategoryQuery;

import java.util.List;

/**
 * 博客分类接口.
 *
 * @author Fan
 */
public interface CategoryService {

    Page<CategoryDO> page(CategoryQuery query);

    List<CategoryDO> list(CategoryQuery query);
}
