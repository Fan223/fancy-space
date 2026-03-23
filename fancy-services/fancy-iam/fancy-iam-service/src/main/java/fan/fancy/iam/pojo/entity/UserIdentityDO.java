package fan.fancy.iam.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import fan.fancy.starter.mybatis.plus.entity.MetaDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户身份实体类.
 *
 * @author Fan
 */
@TableName("user_identity")
@Data
@EqualsAndHashCode(callSuper = true)
public class UserIdentityDO extends MetaDO {

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
