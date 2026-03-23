package fan.fancy.iam.pojo.vo;

import lombok.Data;

/**
 * 用户展示类.
 *
 * @author Fan
 */
@Data
public class UserVO {

    /**
     * 用户ID.
     */
    private String id;

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
    private String birthday;

    /**
     * 性别 0:女 1:男 2:未知.
     */
    private String gender;
}
