package com.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);

        ElConfig resouceService = context.getBean(ElConfig.class);

        resouceService.outputResource();

        context.close();
    }
}