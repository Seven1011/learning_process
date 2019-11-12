package com.seven.service;

public class UserServiceImpl implements UserService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("赋值了："+name);
        this.name = name;
    }

    @Override
    public void add() {
        System.out.println("添加用户:"+name);
    }
}
