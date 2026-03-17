package fan.fancy.blog.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.pojo.entity.CategoryDO;
import fan.fancy.blog.pojo.query.CategoryQuery;
import fan.fancy.blog.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 博客分类实现类.
 *
 * @author Fan
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public Page<CategoryDO> page(CategoryQuery query) {
        return null;
    }

    @Override
    public List<CategoryDO> list(CategoryQuery query) {
        return List.of();
    }
}
