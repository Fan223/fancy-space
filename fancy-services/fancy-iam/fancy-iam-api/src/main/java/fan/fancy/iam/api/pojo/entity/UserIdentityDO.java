package fan.fancy.iam.api.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import fan.fancy.starter.mybatis.plus.entity.MetaDO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

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
     * 身份类型 {@link IdentityType}.
     */
    private Integer identity;

    /**
     * 身份标识(用户名/手机号/邮箱/openid).
     */
    private String identifier;

    /**
     * 凭证(access_token).
     */
    private String credential;

    /**
     * 是否已验证(手机号/邮箱) 0:否 1:是.
     */
    private Integer verified;

    @Getter
    @AllArgsConstructor
    public enum IdentityType {

        USERNAME(1),
        PHONE(2),
        EMAIL(3),
        WECHAT(4),
        QQ(5);

        private final int code;
    }
}
