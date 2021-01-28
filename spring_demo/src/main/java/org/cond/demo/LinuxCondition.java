package org.cond.demo;
/*
 * @time 2021/1/28 19:50
 * @author chy
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
    public LinuxCondition() {
        System.out.println("LinuxCondition 无参构造");
    }

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return false;
    }
}
