package cc.oldx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/11 2:22
 */
@SpringBootApplication
@EnableSwagger2
public class AppRun {
    public static void main(String[] args) {
        SpringApplication.run(AppRun.class,args);

    }
}
