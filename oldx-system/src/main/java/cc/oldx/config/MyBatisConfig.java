package cc.oldx.config;

import cc.oldx.common.interceptor.SqlStatementInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 16:30
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"cc.oldx.mbg.mapper","cc.oldx.modules.system.dao"})
public class MyBatisConfig {
    //打印sql执行语句
    @Bean
    @ConditionalOnProperty(name = "oldx.showsql", havingValue = "true")
    SqlStatementInterceptor sqlStatementInterceptor() {
        return new SqlStatementInterceptor();
    }
}
