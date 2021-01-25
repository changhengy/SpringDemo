package com.demo.lc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class AtuoBean {
    public AtuoBean() {
        System.out.println("自动扫描注册到容器中的无参数构造");
    }
}
