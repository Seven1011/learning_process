package com.seven.vo;

import com.seven.model.User;

//定义擦和讯包装类，以后.xml的参数从这个对象取
public class UserQueryVo {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
