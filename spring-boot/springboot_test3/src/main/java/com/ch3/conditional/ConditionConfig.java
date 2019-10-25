package com.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    /*
    通过@Conditional注解，符合Windows条件实例化widowsListService
    */
    @Bean
    @Conditional(WindowsConditional.class)
    public ListService windowsListService() {
        return new WindowsListServices();
    }
}
