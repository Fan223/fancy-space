package fan.fancy.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.pojo.entity.ArticleDO;
import fan.fancy.blog.pojo.query.ArticleQuery;

import java.util.List;

/**
 * 博客文章接口.
 *
 * @author Fan
 */
public interface ArticleService {

    Page<ArticleDO> page(ArticleQuery query);

    ArticleDO getById(String id);

    ArticleDO upsert(ArticleDO articleDO);

    int deleteById(String id);

    int deleteByIds(List<String> ids);
}
