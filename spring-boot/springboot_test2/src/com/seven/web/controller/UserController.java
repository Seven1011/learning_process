package com.seven.web.controller;

import com.seven.model.User;
import com.seven.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //声明Rest风格的的控制器
@RequestMapping("user")
public class UserController {

//    Logger logger   =   Logger.get(UserController.class);

    @RequestMapping("{id}")
    @ResponseBody
    /*
            通过id查询用户的信息
    */
    public User userInfo(@PathVariable() Integer id) {
        User user = new User("seven", "12345");
        user.setId(id);
        return user;
    }

/*    public static void main(String[] args) {

        SpringApplication.run(UserController.class, args);

    }*/
        @Autowired
        private IUserService userService;
        @RequestMapping("register")
        @ResponseBody
        public String register(String username,String password){
            userService.register(username,password);
            return "success";
        }
}
