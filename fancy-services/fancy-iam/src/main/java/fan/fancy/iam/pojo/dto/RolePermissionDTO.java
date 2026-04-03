package fan.fancy.iam.pojo.dto;

import lombok.Data;

/**
 * 角色权限关联数据传输类.
 *
 * @author Fan
 */
@Data
public class RolePermissionDTO {

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
