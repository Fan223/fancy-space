package fan.fancy.blog.pojo.dto;

import lombok.Data;

/**
 * 博客分类数据传输类.
 *
 * @author Fan
 */
@Data
public class CategoryDTO {

    /**
     * 分类 ID.
     */
    private String id;

    /**
     * 父分类 ID.
     */
    private String parentId;

    /**
     * 分类名称.
     */
    private String name;

    /**
     * 排序.
     */
    private String sortOrder;

    /**
     * 状态.
     */
    private String status;
}
