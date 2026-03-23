package fan.fancy.iam.pojo.dto;

import lombok.Data;

/**
 * 用户角色关联数据传输类.
 *
 * @author Fan
 */
@Data
public class UserRoleDTO {

    /**
     * 用户角色关联ID.
     */
    private String id;

    /**
     * 用户ID.
     */
    private String userId;

    /**
     * 角色ID.
     */
    private String roleId;
}
