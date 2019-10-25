package com.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 */

//工具类的方法应该都是静态的，这样方便我们去调用
public class JDBCUtils {
    private static String url;
    private static String user ;
    private static String password;
    private static String driver;

    /**
     * 文件的读取，只需要读取一次就可以拿到值：使用静态代码块
     */
    static {
//获取资源文件，获取值
        try {

/*
//获取src路径下的文件的方式：ClassLoader 类加载器 ,要获取Classloader，要获取他对应的字节码文件
ClassLoader classLoader = JDBCUtils.class.getClassLoader();
URL resource = classLoader.getResource("jdbc.properties");
String path = resource.getPath(); //返回字符串路径
//System.out.println(path);
*/

            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties pro = new Properties();
//2加载文件
            pro.load(is);
//3获取属性，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
//注册驱动
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取连接
     * @return 连接对象释放资源
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }


    /**
     * 释放资源
     * @param stmt
     * @param conn
     */
    public static void close(ResultSet rs,Statement stmt, Connection conn){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    public static void close(Statement stmt, Connection conn){

        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


}