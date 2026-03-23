package fan.fancy.iam.pojo.dto;

import lombok.Data;

/**
 * 权限数据传输类.
 *
 * @author Fan
 */
@Data
public class PermissionDTO {

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
