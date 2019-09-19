package com.oldx.web.config;

import com.oldx.common.interceptor.SqlStatementInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.oldx.mbg.mapper","com.oldx.web.dao"})
public class MyBatisConfig {
    //打印sql执行语句
    @Bean
    @ConditionalOnProperty(name = "moli.showsql", havingValue = "true")
    SqlStatementInterceptor sqlStatementInterceptor() {
        return new SqlStatementInterceptor();
    }
}
