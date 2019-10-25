package day07.demo05_增强for循环;
/*
    增强for循环比普通的for循环增强在那？
            增强在语法上更加简单

      格式：
                for（数据类型  变量名：数组/集合）{
                        sout（变量名）
                }

       注意：
            当你使用增强for循环遍历集合的时候
              底层采用的是迭代器
         总结：
            当你使用for循环遍历集合的时候，不能修改集合的长度



*/

import java.util.ArrayList;
import java.util.Collection;

public class ForeachDemo {
    public static void main(String[] args) {
        //1.定义数组
		/*int[] nums = {1,2,34,5,6,7};
		for(int m :nums){
			System.out.println(m);
		}*/
        //2.定义集合
        Collection<String> names = new ArrayList<String>();
        names.add("abc");
        names.add("jack");
        names.add("rose");
        names.add("tom");

        for (String name : names) {
            System.out.println(name);
            // names.add("东西");         //不能修改长度
        }
    }
}
