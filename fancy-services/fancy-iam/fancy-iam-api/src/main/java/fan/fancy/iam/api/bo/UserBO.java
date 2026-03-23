package fan.fancy.iam.api.bo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户业务类.
 *
 * @author Fan
 */
@Data
public class UserBO {

    /**
     * 密码.
     */
    private String password;

    /**
     * 昵称.
     */
    private String nickname;

    /**
     * 头像.
     */
    private String avatar;

    /**
     * 生日.
     */
    private LocalDateTime birthday;

    /**
     * 性别 0:女 1:男 2:未知.
     */
    private Integer gender;

    /**
     * 用户ID.
     */
    private Long userId;

    /**
     * 身份类型(PHONE/EMAIL/USERNAME/OTHER).
     */
    private Byte identity;

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
    private Byte verified;
}
