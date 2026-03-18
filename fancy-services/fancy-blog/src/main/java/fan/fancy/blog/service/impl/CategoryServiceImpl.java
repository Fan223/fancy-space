package fan.fancy.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.mapper.CategoryMapper;
import fan.fancy.blog.pojo.entity.CategoryDO;
import fan.fancy.blog.pojo.query.CategoryQuery;
import fan.fancy.blog.service.CategoryService;
import fan.fancy.toolkit.lang.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 博客分类实现类.
 *
 * @author Fan
 */
@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;

    @Override
    public Page<CategoryDO> page(CategoryQuery query) {
        LambdaQueryWrapper<CategoryDO> queryWrapper = buildQueryWrapper(query);
        return categoryMapper.selectPage(new Page<>(query.getCurrentPage(), query.getPageSize()), queryWrapper);
    }

    private LambdaQueryWrapper<CategoryDO> buildQueryWrapper(CategoryQuery query) {
        LambdaQueryWrapper<CategoryDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(StringUtils.isNotBlank(query.getStatus()), CategoryDO::getStatus, query.getStatus())
                .like(StringUtils.isNotBlank(query.getName()), CategoryDO::getName, query.getName());
        return queryWrapper;
    }

    @Override
    public List<CategoryDO> list(CategoryQuery query) {
        LambdaQueryWrapper<CategoryDO> queryWrapper = buildQueryWrapper(query);
        return categoryMapper.selectList(queryWrapper);
    }

    @Override
    public int create(CategoryDO categoryDO) {
        return categoryMapper.insert(categoryDO);
    }

    @Override
    public int update(CategoryDO categoryDO) {
        return categoryMapper.updateById(categoryDO);
    }

    @Override
    public int deleteById(String id) {
        return categoryMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return categoryMapper.deleteByIds(ids);
    }
}
