package org.annotation.demo;
/*
 * @time 2021/2/7 15:05
 * @author chy
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.annotation.Annotation;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class JavaConfig {

    @Bean()
    public Calcul calcul() {
        Class clazz = this.getClass();
        if (clazz.isAnnotationPresent(Bean.class)) {
            System.out.println("配置文件中也可以做，Bean 是否已经被注解的判断");
//            Annotation bean =  clazz.getAnnotation(Bean.class);
//            System.out.println(bean.getClass());
        }
        return new Calcul();
    }
}
