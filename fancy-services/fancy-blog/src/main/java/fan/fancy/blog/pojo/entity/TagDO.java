package fan.fancy.blog.pojo.entity;

import fan.fancy.mybatis.plus.starter.entity.MetaDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 博客标签实体类.
 *
 * @author Fan
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TagDO extends MetaDO {

    /**
     * 标签名称.
     */
    private String name;
}
