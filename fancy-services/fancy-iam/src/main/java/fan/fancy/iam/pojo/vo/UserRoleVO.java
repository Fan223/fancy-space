package fan.fancy.iam.pojo.vo;

import lombok.Data;

/**
 * 用户角色关联展示类.
 *
 * @author Fan
 */
@Data
public class UserRoleVO {

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
