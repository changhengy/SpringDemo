package com.demo.lc;
/*
 * @time 2021/1/25 10:57
 * @author chy
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public UserBean userBean_1() {
        return new UserBean();
    }

    @Bean
    public UserBean userBean_2() {
        return new UserBean("chy", 5);
    }

    @Bean("userTerst")
    public UserBean userBean_3() {
        UserBean userBean = new UserBean();
        userBean.setAge(15);
        userBean.setName("wudihaoke");
        return userBean;
    }
}
