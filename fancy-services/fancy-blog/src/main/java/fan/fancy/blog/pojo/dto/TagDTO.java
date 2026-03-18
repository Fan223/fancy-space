package fan.fancy.blog.pojo.dto;

import lombok.Data;

/**
 * 博客标签数据传输类.
 *
 * @author Fan
 */
@Data
public class TagDTO {

    /**
     * 标签 ID.
     */
    private String id;

    /**
     * 标签名称.
     */
    private String name;
}
