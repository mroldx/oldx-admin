package cc.oldx.common.annotation;

import java.lang.annotation.*;

/**
 * @Author: MrOldx <br/>
 * @Descrption:
 * @Date:Created in 15:13 2020/7/27  <br/>
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})//目标是方法
@Retention(RetentionPolicy.RUNTIME)//注解会在class中存在，运行时可通过反射获取
@Documented//文档生成时，该注解将被包含在javadoc中，可去掉
@Inherited
public @interface MoliAspectLog {
    String operModul() default ""; // 操作模块


    String operType() default "";  // 操作类型


    String operDesc() default "";  // 操作说明
}
