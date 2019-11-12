package com.seven.test;

import com.seven.mapper.OrderMapper;
import com.seven.mapper.UserMapper;
import com.seven.model.*;
import com.seven.vo.UserQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import com.seven.model.Orders;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo03 {
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

        //构建查询对象
        UserQueryVo vo = new UserQueryVo();

        //设置set
        User user = new User();
        user.setUsername("seven");
        user.setSex("女");
        vo.setUser(user);

        //查询用户列表
        List<User> list = userMapper.findUserList(vo);
        System.out.println(list);

        session.close();
    }

    /**
     * 一对一：resultType实现
     *
     * @throws IOException
     */
    @Test
    public void test2() throws Exception {

        SqlSession session = ssf.openSession();
        //通过session获取代理【JDK实现的代理】
        OrderMapper orderMapper = session.getMapper(OrderMapper.class);

        OrdersExt ordersExt = orderMapper.findOrdersUser(3);
        System.out.println(ordersExt);

        session.close();

    }

    /**
     * 一对一：resultMap实现
     *
     * @throws IOException
     */
/*    @Test
    public void test3() throws Exception {

        SqlSession session = ssf.openSession();
        //通过session获取代理【JDK实现的代理】
        OrderMapper orderMapper =   session.getMapper(OrderMapper.class);

        Orders orders = orderMapper.findOrdersByRslMap(5);
        System.out.println(orders);

        session.close();

    }*/

    /**
     * 一对多
     *
     * @throws IOException
     */
    @Test
    public void test8() {
        SqlSession session = ssf.openSession();

        OrderMapper mapper = session.getMapper(OrderMapper.class);
        Orders order = mapper.findOrderById3(3);
        System.out.println(order);
        System.out.println(order.getUser());
        System.out.println(order.getOrderDetails());
    }

    /**
     * 一对多
     *
     * @throws IOException
     */
    @Test
    public void test9() {
        SqlSession session = ssf.openSession();
        //通过session获取代理【JDK实现的代理】
        UserMapper mapper = session.getMapper(UserMapper.class);

        List<User> list = mapper.findUserAndItemRslMap();

        System.out.println(list.size());
        for (User user : list) {
            System.out.println("用户名" + user.getUsername() + "-  地址：" + user.getAddress());
            for (Orders orders : user.getOrdersList()) {
                System.out.println("订单ID：" + orders.getId());
                System.out.println("订单Number：" + orders.getNumber());
                System.out.println("订单时间：" + orders.getCreatetime());
                for (OrderDetail od : orders.getOrderDetails()) {

                    System.out.println();
                    System.out.println("【商品数量：】" + od.getItemsNum());
                    System.out.println("【商品名称：】" + od.getItems().getName());
                    System.out.println("【商品详情】" + od.getItems().getDetail());
                }

                System.out.println();
                System.out.println("======================");
            }
        }

        session.close();
    }

    /**
     * 懒加载
     *
     * @throws IOException
     */
    @Test
    public void test10() throws IOException {
        SqlSession session = ssf.openSession();

        OrderMapper mapper = session.getMapper(OrderMapper.class);


        List<Orders> list = mapper.findOrderAndUserByLazyLoading();
        for (Orders order : list
        ) {
            System.out.println(order);
        }
    }
}