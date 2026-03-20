package fan.fancy.iam.pojo.vo;

import lombok.Data;

/**
 * 菜单展示类.
 *
 * @author Fan
 */
@Data
public class MenuVO {

    /**
     * 菜单ID.
     */
    private String id;

    /**
     * 父菜单ID.
     */
    private String parentId;

    /**
     * 菜单名称.
     */
    private String name;

    /**
     * 菜单路径.
     */
    private String path;

    /**
     * 权限码.
     */
    private String permission;

    /**
     * 组件.
     */
    private String component;

    /**
     * 图标.
     */
    private String icon;

    /**
     * 类型 0:顶栏 1:侧栏.
     */
    private String type;

    /**
     * 排序.
     */
    private String sortOrder;
}
