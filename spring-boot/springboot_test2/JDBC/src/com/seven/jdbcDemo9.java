package com.seven;

import com.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 通过键盘录入用户和密码
 * 判断用户是否登录成功
 */

public class jdbcDemo9 {

    public static void main(String[] args) {
//1.键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
//2.调用方法
        boolean flag = new jdbcDemo9().login2(username,password);

//3.判断结果输出不同语句
        if (flag){
            System.out.println("登录成功");
        }else {
            System.out.println("用户名或密码错误");
        }

    }

    /**
     * 登录方法使用PreparedStatement实现
     */


    public boolean login2(String username,String password){
        if (username==null || password==null){
            return false;
        }
        Connection conn =null;
        PreparedStatement pstmt = null;
        ResultSet rs =null;

//连接数据库判断是否登录成功
        try {
            conn = JDBCUtils.getConnection();//在这里debug的时候显示conn=null,以及下面的变量都显示错误
//2定义sql
            String sql = "select * from user where username = ? and password = ?";
//3获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
//给？赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
//4执行查询 不需要传递参数
            rs = pstmt.executeQuery(sql);
//5.判断
            return rs.next(); //如果有下一行，返回true

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try{
                JDBCUtils.close(rs,pstmt,conn);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        return false;
    }
}