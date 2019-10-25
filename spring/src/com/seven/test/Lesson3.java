package com.seven.test;

import com.seven.service.UserService;
import com.seven.service.UserServiceFactory1;
import com.seven.service.UserServiceFactory2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lesson3 {


    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");

        //new 对象
        //IUserService userService1 = (IUserService) context.getBean("userService1");
        //userService1.add();


        //静态工厂
        //UserService userService2 = UserServiceFactory1.createUserService();
//        UserService userService2 = (UserService) context.getBean("userService2");
//        userService2.add();


        //实例工厂
        //1.创建工厂
         UserServiceFactory2 factory2 = new UserServiceFactory2();
         //UserService userService3 = factory2.createUserService();

        UserService userService3 = (UserService) context.getBean("userService3");
         userService3.add();
    }

}
