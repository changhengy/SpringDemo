package org.cond.demo;
/*
 * @time 2021/1/28 14:28
 * @author chy
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class DemoMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

        CmdImpl cmd = ctx.getBean(CmdImpl.class);
        String str = cmd.showCmd();
        System.out.println("str " + str);

    }

}
