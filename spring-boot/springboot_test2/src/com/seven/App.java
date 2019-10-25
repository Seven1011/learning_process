package com.seven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@ComponentScan(basePackages = {"com.seven.web", "com.seven.service"})
@SpringBootApplication
public class App {
    public static void main(String[] args) {

        //启动springboot项目
        SpringApplication.run(App.class,args);
    }
}
