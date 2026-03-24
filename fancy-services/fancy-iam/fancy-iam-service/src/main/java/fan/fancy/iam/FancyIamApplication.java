package fan.fancy.iam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 身份访问管理启动类.
 *
 * @author Fan
 */
@SpringBootApplication
@MapperScan("fan.fancy.iam.mapper")
@EnableFeignClients
public class FancyIamApplication {
    static void main() {
        SpringApplication.run(FancyIamApplication.class);
    }
}
