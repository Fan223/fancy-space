package fan.fancy.iam.pojo.vo;

import lombok.Data;

/**
 * 角色展示类.
 *
 * @author Fan
 */
@Data
public class RoleVO {

    /**
     * 角色ID.
     */
    private String id;

    /**
     * 角色编码.
     */
    private String code;

    /**
     * 角色名称.
     */
    private String name;
}
