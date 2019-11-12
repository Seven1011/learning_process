package com.seven.test;

import com.seven.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Demo02 {
    SqlSession session;

    @Before
    public void before() throws IOException {
        System.out.println("before......获取session");
        //1.读取配置文件：
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.通过SqlSessionFactoryBuilder创建SqlSessionFactory会话工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.通过SqlSessionFactory创建SqlSession
        session = sessionFactory.openSession();
    }

    @After
    public void after() {
        System.out.println("after......关闭session");
//        关闭SqlSession。
        session.close();
    }

    /**
     * 查询：一条记录和多条记录
     *
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {

//        //查询一条结果
//        User user = session.selectOne("findUserById", 10);
//        System.out.println(user);
//
////        String s;
////        查询多条结果
//        List<User> users = session.selectList("findUserByName", "张");
//        System.out.println(users);

            //增删改要务

            User user = new User("seven","2","2019-10-1","广州");
            int affectRow = session.insert("insertUser",user);
            session.commit();//事务
            System.out.println("受影响的行数:" + affectRow);
        }
    }
