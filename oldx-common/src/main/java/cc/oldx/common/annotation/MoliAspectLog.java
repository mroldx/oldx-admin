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
    /**
     * 操作描述 业务名称business
     *
     * @return
     */
    String description() default "";



    /**
     * 主键入参参数名称，入参中的哪个参数为主键
     *
     * @return
     */
    String primaryKeyName() default "";

    /**
     * 主键在参数中的顺序，从0开始，默认0
     */
    int primaryKeySort() default 0;

    /**
     * 业务类型
     * @return
     */
    String business() default "";
}
