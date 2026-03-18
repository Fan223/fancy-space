package fan.fancy.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.pojo.entity.TagDO;
import fan.fancy.blog.pojo.query.TagQuery;

import java.util.List;

/**
 * 博客标签接口.
 *
 * @author Fan
 */
public interface TagService {

    Page<TagDO> page(TagQuery query);

    List<TagDO> list(TagQuery query);

    int create(TagDO tagDO);

    int update(TagDO tagDO);

    int deleteById(String id);

    int deleteByIds(List<String> ids);
}
