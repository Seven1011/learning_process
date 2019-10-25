package com.seven.web.controller;

import com.seven.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
/*
    @RestController   用于写API，给移动客户端提供数据，一般是返回json数据
    @Controller  一般用于写后台（有页面）


*/

@Controller //声明的控制器
@RequestMapping("stu")
public class StudentController {

    @RequestMapping("list")
        public String list(Model model) {
        model.addAttribute("username", "seven");
        model.addAttribute("age", 20);
        List<Student> stuList = new ArrayList<Student>();
        model.addAttribute("username", "seven");
        stuList.add(new Student(10001, "张三", "男"));
        stuList.add(new Student(10002, "李四", "男"));
        stuList.add(new Student(10003, "王五", "男"));
        model.addAttribute("stuList", stuList);

        return "stu/list"; //找模板页面
    }

}
