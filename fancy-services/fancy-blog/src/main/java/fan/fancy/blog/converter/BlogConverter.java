package fan.fancy.blog.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Mapping(target = "createTime", source = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(target = "updateTime", source = "updateTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    ArticleVO transArticles(ArticleDO articleDO);

    List<ArticleVO> transArticles(List<ArticleDO> articleDos);

    Page<ArticleVO> transArticles(Page<ArticleDO> doPage);


//    ArticleDO transArticles(ArticleDTO articleDTO);

    CategoryVO transCategories(CategoryDO categoryDO);

    List<CategoryVO> transCategories(List<CategoryDO> categoryDos);

//    CategoryDO transCategories(CategoryDTO categoryDTO);
}
