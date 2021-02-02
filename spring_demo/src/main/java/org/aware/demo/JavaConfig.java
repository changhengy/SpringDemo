package org.aware.demo;
/*
 * @time 2021/2/2 16:41
 * @author chy
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public User wudihaoke() {
        return new User();
    }

    @Bean
    public User 老常() {
        return new User();
    }

    @Bean
    public DemoBean demoBean() {
        return new DemoBean();
    }

}
