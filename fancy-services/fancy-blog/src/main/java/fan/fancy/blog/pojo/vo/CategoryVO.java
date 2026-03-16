package fan.fancy.blog.pojo.vo;

import lombok.Data;

/**
 * 博客分类展示类.
 *
 * @author Fan
 */
@Data
public class CategoryVO {

    /**
     * 分类 ID.
     */
    private String id;

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
