package com.ch2.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ch2.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
