package fan.fancy.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 博客服务启动类.
 *
 * @author Fan
 */
@SpringBootApplication
@MapperScan("fan.fancy.blog.mapper")
public class FancyBlogApplication {
    static void main(String[] args) {
        SpringApplication.run(FancyBlogApplication.class, args);
    }
}
