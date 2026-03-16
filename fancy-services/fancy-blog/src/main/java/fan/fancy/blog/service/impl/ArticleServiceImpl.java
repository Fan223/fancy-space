package fan.fancy.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.mapper.ArticleMapper;
import fan.fancy.blog.pojo.entity.ArticleDO;
import fan.fancy.blog.pojo.query.ArticleQuery;
import fan.fancy.blog.pojo.vo.ArticleVO;
import fan.fancy.blog.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
    public Page<ArticleDO> list(ArticleQuery query) {
        LambdaQueryWrapper<ArticleDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ArticleDO::getTitle, query.getTitle());
        return articleMapper.selectPage(new Page<>(query.getCurrentPage(), query.getPageSize()), queryWrapper);
    }

    @Override
    public ArticleVO getById(Long id) {
        return null;
    }
}
