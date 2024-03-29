package com.seven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OneController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    @ResponseBody
    public String index(){

        String sql = "insert into user (id,name) values (1,'zhangsan')";
        jdbcTemplate.execute(sql);
        System.out.println("执行完成");

        return "hello spring boot";
    }
}