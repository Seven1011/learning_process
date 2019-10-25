package com.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.ch2.el")
@PropertySource("../../../resources/test.properties")
public class ElConfig
{

    @Value("I Love You")
    private  String normal;


    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}") // 注入配置文件
    private String bookName;

    @Autowired // 注入配置文件
    private Environment environment;

    @Bean // 注入配置文件
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
