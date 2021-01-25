package com.demo.lc;
/*
 * @time 2021/1/25 10:57
 * @author chy
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Annotation;

public class DemoMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anotCtx = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserBean u1 = anotCtx.getBean("userBean_1", UserBean.class);
        UserBean u2 = anotCtx.getBean("userBean_2", UserBean.class);
        UserBean u3 = anotCtx.getBean("userTerst", UserBean.class);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }

}
