package com.seven.service;

public class UserServiceFactory1 {

    public static UserService createUserService(){
        return new UserServiceImpl();
    }
}
