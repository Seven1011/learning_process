package com.seven.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//加载指定properties文件内的配置通过prefix属性指定properties的配置的前缀(通过locations指定properties文件的位置)
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}

