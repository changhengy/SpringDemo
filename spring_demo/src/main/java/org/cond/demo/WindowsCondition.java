package org.cond.demo;
/*
 * @time 2021/1/28 19:48
 * @author chy
 */

//import java.util.concurrent.locks.Condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {
    public WindowsCondition() {
        System.out.println("WindowsCondition 无参构造");
    }

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return true;
    }
}
