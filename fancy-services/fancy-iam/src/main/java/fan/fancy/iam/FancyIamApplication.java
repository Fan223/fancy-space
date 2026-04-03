package fan.fancy.iam;

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
public class FancyIamApplication {
    static void main() {
        SpringApplication.run(FancyIamApplication.class);
    }
}
