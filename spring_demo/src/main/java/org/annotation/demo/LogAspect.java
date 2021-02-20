package org.annotation.demo;
/*
 * @time 2021/2/7 14:47
 * @author chy
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {
    public LogAspect() {
        System.out.println("LogAspect.LogAspect 初始化");
    }

    @Before(value = "@annotation(MyAnnotation)")
    public void before(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String mName = signature.getName();
        System.out.println("方法 : " + mName + "开始执行了.....");

    }
}
