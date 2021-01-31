package org.cond.demo;
/*
 * @time 2021/1/28 14:28
 * @author chy
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class DemoMain {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(JavaConfig.class);
        ctx.refresh();
        CmdImpl cmd = ctx.getBean(CmdImpl.class);
        CmdImpl cmd_12 = ctx.getBean(CmdImpl.class);
//        String str = cmd.showCmd();
//        String str_1 = cmd.showCmd();
//        String str_3 = cmd.showCmd();
//        System.out.println("str " + str);
//        System.out.println("str " + str_1);
//        System.out.println("str " + str_3);
        System.out.println(cmd == cmd_12);

    }

}
