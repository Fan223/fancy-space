package fan.fancy.iam.pojo.vo;

import lombok.Data;

/**
 * 权限展示类.
 *
 * @author Fan
 */
@Data
public class PermissionVO {

    /**
     * 权限ID.
     */
    private String id;

    /**
     * 权限编码.
     */
    private String code;

    /**
     * 权限名称.
     */
    private String name;
}
