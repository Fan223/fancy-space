package fan.fancy.blog.pojo.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 子分类列表.
     */
    private List<CategoryVO> children = new ArrayList<>();
}
