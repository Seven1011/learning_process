package com.ch3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
/*
    判定Windows的条件
*/

public class WindowsConditional implements Condition {

    public boolean matches(ConditionContext context,
                           AnnotatedTypeMetadata metadata){
        return
                context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
