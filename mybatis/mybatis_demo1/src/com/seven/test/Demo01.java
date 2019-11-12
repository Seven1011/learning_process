package com.seven.test;

import com.seven.mapper.UserMapper;
import com.seven.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo01 {
    SqlSessionFactory ssf;

    @Before
    public void before() throws IOException {

        //1.读取配置文件：
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.通过SqlSessionFactoryBuilder创建SqlSessionFactory会话工厂
        ssf = new SqlSessionFactoryBuilder().build(is);

    }

    /**
     * 查询：一条记录和多条记录
     *
     * @throws IOException
     */
    @Test
    public void test1() throws Exception {

        SqlSession session = ssf.openSession();
        //通过session获取代理【JDK实现的代理】
        UserMapper userMapper = session.getMapper(UserMapper.class);
        //保存用户
        User user = new User();
        user.setId(31);
        user.setUsername("seven02");
        userMapper.save(user);
        System.out.println(user);

        //查找用户
        User u = userMapper.findUserById(10);
        System.out.println(u);

        session.commit();
        session.close();
    }
}