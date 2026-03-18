package fan.fancy.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.mapper.TagMapper;
import fan.fancy.blog.pojo.entity.TagDO;
import fan.fancy.blog.pojo.query.TagQuery;
import fan.fancy.blog.service.TagService;
import fan.fancy.toolkit.lang.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 博客标签实现类.
 *
 * @author Fan
 */
@Service
@AllArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagMapper tagMapper;

    @Override
    public Page<TagDO> page(TagQuery query) {
        LambdaQueryWrapper<TagDO> queryWrapper = buildQueryWrapper(query);
        return tagMapper.selectPage(new Page<>(query.getCurrentPage(), query.getPageSize()), queryWrapper);
    }

    private LambdaQueryWrapper<TagDO> buildQueryWrapper(TagQuery query) {
        LambdaQueryWrapper<TagDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(query.getName()), TagDO::getName, query.getName());
        return queryWrapper;
    }

    @Override
    public List<TagDO> list(TagQuery query) {
        LambdaQueryWrapper<TagDO> queryWrapper = buildQueryWrapper(query);
        return tagMapper.selectList(queryWrapper);
    }

    @Override
    public int create(TagDO tagDO) {
        return tagMapper.insert(tagDO);
    }

    @Override
    public int update(TagDO tagDO) {
        return tagMapper.updateById(tagDO);
    }

    @Override
    public int deleteById(String id) {
        return tagMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return tagMapper.deleteByIds(ids);
    }
}
