package com.seven.mapper;

import com.seven.model.User;
import com.seven.vo.UserQueryVo;

import java.util.List;

public interface UserMapper {
    public void save(User user);
    public User findUserById(int id);

    public List<User> findUserList(UserQueryVo  userQueryVo);
    public List<User> findUserAndItemRslMap();

}
