package fan.fancy.blog.pojo.vo;

import lombok.Data;

/**
 * 博客文章展示类.
 *
 * @author Fan
 */
@Data
public class ArticleVO {

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
    private Integer status;

    /**
     * 创建时间.
     */
    private String createTime;

    /**
     * 更新时间.
     */
    private String updateTime;
}
