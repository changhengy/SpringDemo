package org.aware.demo;
/*
 * @time 2021/2/2 16:43
 * @author chy
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareDemo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
//        ctx.getBean("wudihaoke");
        ctx.getBean("老常");

    }
}
