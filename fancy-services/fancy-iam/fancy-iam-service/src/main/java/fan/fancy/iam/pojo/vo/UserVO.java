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
     * 用户名.
     */
    private String username;

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

    /**
     * 手机号.
     */
    private String phone;

    /**
     * 邮箱.
     */
    private String email;
}
