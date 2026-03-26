package fan.fancy.iam.api.pojo.bo;

import fan.fancy.iam.api.pojo.entity.UserIdentityDO;
import lombok.Data;

import java.util.List;

/**
 * 用户业务类.
 *
 * @author Fan
 */
@Data
public class UserBO {

    /**
     * 用户ID.
     */
    private String id;

    /**
     * 用户名.
     */
    private String username;

    /**
     * 密码.
     */
    private String password;

    /**
     * 头像.
     */
    private String avatar;

    /**
     * 昵称.
     */
    private String nickname;

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

    /**
     * 用户身份列表.
     */
    private List<UserIdentityDO> userIdentities;
}
