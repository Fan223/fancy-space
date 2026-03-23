package fan.fancy.iam.pojo.vo;

import lombok.Data;

/**
 * 用户身份展示类.
 *
 * @author Fan
 */
@Data
public class UserIdentityVO {

    /**
     * 用户身份ID.
     */
    private String id;

    /**
     * 用户ID.
     */
    private String userId;

    /**
     * 身份类型(PHONE/EMAIL/USERNAME/OTHER).
     */
    private String identity;

    /**
     * 身份标识(手机号/邮箱/用户名/openid).
     */
    private String identifier;

    /**
     * 凭证(access_token).
     */
    private String credential;

    /**
     * 是否已验证(手机号/邮箱) 0:否 1:是.
     */
    private String verified;
}
