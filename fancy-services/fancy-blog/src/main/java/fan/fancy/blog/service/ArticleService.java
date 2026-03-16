package fan.fancy.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.pojo.entity.ArticleDO;
import fan.fancy.blog.pojo.query.ArticleQuery;
import fan.fancy.blog.pojo.vo.ArticleVO;

/**
 * 博客文章接口.
 *
 * @author Fan
 */
public interface ArticleService {

    Page<ArticleDO> list(ArticleQuery query);

    ArticleVO getById(Long id);
}
