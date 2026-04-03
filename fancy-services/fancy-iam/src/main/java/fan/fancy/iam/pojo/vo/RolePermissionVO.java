package fan.fancy.iam.pojo.vo;

import lombok.Data;

/**
 * 角色权限关联展示类.
 *
 * @author Fan
 */
@Data
public class RolePermissionVO {

    /**
     * 角色权限关联ID.
     */
    private String id;

    /**
     * 角色ID.
     */
    private String roleId;

    /**
     * 权限ID.
     */
    private String permissionId;
}
