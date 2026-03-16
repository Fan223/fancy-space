package fan.fancy.blog.pojo.entity;

import fan.fancy.mybatis.plus.starter.entity.MetaDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 博客分类实体类.
 *
 * @author Fan
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryDO extends MetaDO {

    /**
     * 父分类 ID, 0:顶级分类.
     */
    private Long parentId;

    /**
     * 分类名称.
     */
    private String name;

    /**
     * 排序.
     */
    private Integer sortOrder;

    /**
     * 状态.
     */
    private Integer status;
}
