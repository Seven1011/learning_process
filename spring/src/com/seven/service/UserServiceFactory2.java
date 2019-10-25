package com.seven.service;

public class UserServiceFactory2 {

    public  UserService createUserService(){
        return new UserServiceImpl();
    }
}
