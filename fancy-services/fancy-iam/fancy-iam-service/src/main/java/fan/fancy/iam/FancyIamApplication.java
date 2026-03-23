package fan.fancy.iam;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 身份访问管理启动类.
 *
 * @author Fan
 */
@SpringBootApplication
@MapperScan("fan.fancy.iam.mapper")
@EnableDubbo
public class FancyIamApplication {
    static void main() {
        SpringApplication.run(FancyIamApplication.class);
    }
}
