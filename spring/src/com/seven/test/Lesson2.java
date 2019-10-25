package com.seven.test;

import com.seven.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson2 {


    @Test
    public void test1(){
        //1.查询类路经加载配置文件【ctr+t：查看类的结构】
        ApplicationContext context  =   new ClassPathXmlApplicationContext("beans2.xml");

        //2.根据id  获取bean
        //Spring是一个大工厂（容器），专门生产bean，bean就是一个对象
        UserService userSrevice =   (UserService) context.getBean("userServiceId");
        userSrevice.add();


    }
}
