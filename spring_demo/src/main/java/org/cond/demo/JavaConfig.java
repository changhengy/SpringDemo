package org.cond.demo;
/*
 * @time 2021/1/28 14:28
 * @author chy
 */

import org.springframework.context.annotation.*;

@Configuration
public class JavaConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    @Profile("test")
    @Scope("prototype")
    public WinCmd wintestCmd() {
        return new WinCmd();
    }


    @Bean
    @Conditional(WindowsCondition.class)
    @Profile("dev")
    @Scope("singleton")
    public WinCmd windevCmd() {
        return new WinCmd();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public LinuxCmd linuxCmd() {
        return new LinuxCmd();
    }
}
