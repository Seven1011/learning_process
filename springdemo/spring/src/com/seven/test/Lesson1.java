package com.seven.test;

import com.seven.service.UserServiceImpl;
import com.seven.service.UserService;

public class Lesson1 {
    public static void main(String[] args) {
        //以前调用service的方式
        UserService userService =   new UserServiceImpl();
        userService.add();


    }


}
