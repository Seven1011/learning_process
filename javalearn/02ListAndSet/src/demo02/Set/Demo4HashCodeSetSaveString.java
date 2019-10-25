package demo02.Set;
/*
    HashSetc存储自定义类型的元素

    set集合报错元素唯一：
        存储的元素（String,Integer,...Student,Person...）,必须重写hashCode方法和equals方法

     要求：
            同名同年龄的人，视为同一个人，只能存储一次
*/

import java.util.HashSet;

public class Demo4HashCodeSetSaveString {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<person> set = new HashSet<>();
        person p1 = new person("张三", 19);
        person p2 = new person("张三", 18);
        person p3 = new person("张三", 18);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}



