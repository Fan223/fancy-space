package fan.fancy.blog.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.blog.pojo.dto.ArticleDTO;
import fan.fancy.blog.pojo.dto.CategoryDTO;
import fan.fancy.blog.pojo.entity.ArticleDO;
import fan.fancy.blog.pojo.entity.CategoryDO;
import fan.fancy.blog.pojo.vo.ArticleVO;
import fan.fancy.blog.pojo.vo.CategoryVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * 博客实体转换类.
 *
 * @author Fan
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BlogConverter {

    @Mapping(target = "updateTime", source = "updateTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    ArticleVO convertArticle(ArticleDO articleDO);

    List<ArticleVO> convertArticles(List<ArticleDO> list);

    Page<ArticleVO> convertArticles(Page<ArticleDO> page);

    ArticleDO convertArticle(ArticleDTO articleDTO);

    CategoryVO convertCategories(CategoryDO categoryDO);

    List<CategoryVO> convertCategories(List<CategoryDO> list);

    Page<CategoryVO> convertCategories(Page<CategoryDO> page);

    CategoryDO convertCategories(CategoryDTO categoryDTO);
}
