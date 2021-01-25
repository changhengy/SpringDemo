package com.demo.lc;

import org.springframework.stereotype.Component;

@Component
public class ZAutoBean {
    public ZAutoBean() {
        System.out.println("Z开头类的无参数构造");
    }
}
