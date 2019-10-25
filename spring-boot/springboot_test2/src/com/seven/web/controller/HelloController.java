package com.seven.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //声明Rest风格的的控制器
public class HelloController {

    @RequestMapping("hello/{name}")
    @ResponseBody
    public String hello(@PathVariable() String  name) {
        return name+"Hello,Spring  Boot..";
    }

/*public static void main(String[] args) {
        //启动Springboot项目的控制器
        SpringApplication.run(HelloController.class, args);
    }*/
}
