package cn.ithema.Demo1MyException;

import java.util.Scanner;

/*
    要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册

    分析：
        1、使用数组保存已经注册过的用户名（数据库）
        2、使用Scanner获取用户输入的注册的用户名（前段，页面）
        3、定义一个方法面对用户输入的注册的用户进行判断
            遍历存储已经注册过用户名的数组，获取每一个用户名
            使用说去到的用户名和用户输入的用户名进行对比
                true：
                    用户名已经存在，抛出  RegeisterException异常告知用户：亲，该用户名已经被注册
                false：
                    继续便利比较
                  如果循环结束了，还没有找到重复的用户名，提示用户"恭喜您，注册成功！"；

 */
public class Demo01RegeisterException extends Exception {

    // 1、使用数组保存已经注册过的用户名（数据库）
    static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) /*throws RegeisterException */ {
        //2、使用Scanner获取用户输入的注册的用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String username = sc.next();
        checkUsername(username);
    }

    //3、定义一个方法面对用户输入的注册的用户进行判断
    public static void checkUsername(String username) /*throws RegeisterException */ {
        // 遍历存储已经注册过用户名的数组，获取每一个用户名
        for (String name : usernames) {
            //使用说去到的用户名和用户输入的用户名进行对比
            if (name.equals(username)) {
//                true:用户名已经存在，抛出  RegeisterException异常告知用户：亲，该用户名已经被注册
                try {
                    throw new RegeisterException("亲，该用户名已经被注册");
                } catch (RegeisterException e) {
                    e.printStackTrace();
                    return;
                }

            }

        }

        //如果虚幻结束了，还没有找到重复的用户名，提示用户“恭喜您，注册成功！”；
        System.out.println("恭喜您，注册成功！");
    }

}
