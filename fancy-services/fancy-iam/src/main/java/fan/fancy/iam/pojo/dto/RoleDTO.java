package fan.fancy.iam.pojo.dto;

import lombok.Data;

/**
 * 角色数据传输类.
 *
 * @author Fan
 */
@Data
public class RoleDTO {

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
