//package cc.oldx.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @Author: MrOldx <br/>
// * @Descrption:
// * @Date:Created in 15:26 2020/8/11  <br/>
// */
//@ComponentScan
//@Configuration
//@EnableWebMvc
//public class WebViewConfig implements WebMvcConfigurer {
//
//    /**
//     * 注册html视图解析器
//     */
//    @Bean
//    public ITemplateResolver templateResolver() {
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setTemplateMode("HTML");
//        templateResolver.setPrefix("classpath:/templates/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setCharacterEncoding("utf-8");
//        templateResolver.setCacheable(false);
//        return templateResolver;
//    }
//
//    /**
//     * 将自定义tml视图解析器添加到模板引擎并主持到ioc
//     */
//    @Bean
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        return templateEngine;
//    }
//    /**
//     * Thymeleaf视图解析器配置
//     */
//    @Bean
//    public ThymeleafViewResolver viewResolverThymeLeaf() {
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine());
//        viewResolver.setCharacterEncoding("utf-8");
//        viewResolver.setViewNames(new String[]{"thymeleaf"});
//        viewResolver.setOrder(1);
//        return viewResolver;
//    }
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//
//    /**
//     * 配置静态文件映射
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//        //根据自己项目的实际路径去配置
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/static/");
//    }
//}
//
