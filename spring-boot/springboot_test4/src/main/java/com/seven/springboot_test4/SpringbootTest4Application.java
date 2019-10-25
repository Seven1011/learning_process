package com.seven.springboot_test4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
@SpringBootApplication
public class SpringbootTest4Application {

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;


    @RequestMapping("/")
    String index(){
        return "book name is:"+bookName+"and book author is:"+bookAuthor;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTest4Application.class, args);
    }

}
