package org.annotation.demo;
/*
 * @time 2021/2/3 17:01
 * @author chy
 */

import java.lang.annotation.*;

@Documented
@Target({
        ElementType.METHOD,ElementType.FIELD
}
)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "";
    int id() default 0;
    int min() default 1;
    int max() default 5;
}
