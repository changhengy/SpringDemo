package org.cond.demo;
/*
 * @time 2021/1/28 14:28
 * @author chy
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public WinCmd winCmd() {
        return new WinCmd();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public LinuxCmd linuxCmd() {
        return new LinuxCmd();
    }
}
