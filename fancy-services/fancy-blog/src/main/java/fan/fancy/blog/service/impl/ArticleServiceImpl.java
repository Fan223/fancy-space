package fan.fancy.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.mapper.ArticleMapper;
import fan.fancy.blog.pojo.entity.ArticleDO;
import fan.fancy.blog.pojo.query.ArticleQuery;
import fan.fancy.blog.service.ArticleService;
import fan.fancy.toolkit.lang.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 博客文章实现类.
 *
 * @author Fan
 */
@Service
@AllArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleMapper articleMapper;

    @Override
    public Page<ArticleDO> page(ArticleQuery query) {
        LambdaQueryWrapper<ArticleDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(StringUtils.isNotBlank(query.getStatus()), ArticleDO::getStatus, query.getStatus())
                .like(StringUtils.isNotBlank(query.getTitle()), ArticleDO::getTitle, query.getTitle());
        return articleMapper.selectPage(new Page<>(query.getCurrentPage(), query.getPageSize()), queryWrapper);
    }

    @Override
    public ArticleDO getById(String id) {
        return articleMapper.selectById(id);
    }

    @Override
    public ArticleDO upsert(ArticleDO articleDO) {
        articleMapper.insertOrUpdate(articleDO);
        return articleDO;
    }

    @Override
    public int deleteById(String id) {
        return articleMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return articleMapper.deleteByIds(ids);
    }
}
