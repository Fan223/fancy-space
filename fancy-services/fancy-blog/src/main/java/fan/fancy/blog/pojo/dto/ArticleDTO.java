package fan.fancy.blog.pojo.dto;

import lombok.Data;

/**
 * 博客文章数据传输类.
 *
 * @author Fan
 */
@Data
public class ArticleDTO {

    /**
     * 文章 ID.
     */
    private String id;

    /**
     * 封面.
     */
    private String cover;

    /**
     * 标题.
     */
    private String title;

    /**
     * 摘要.
     */
    private String summary;

    /**
     * 内容.
     */
    private String content;

    /**
     * 状态.
     */
    private String status;
}
