package com.seven.mapper;

import com.seven.model.Orders;
import com.seven.model.OrdersExt;
import com.seven.model.User;
import com.seven.vo.UserQueryVo;

import java.util.List;

public interface OrderMapper {

    //根据订单id查询订单信息
    public OrdersExt findOrdersUser(int ordersId);

    public Orders findOrderById2(int id);

    public Orders findOrderById3(int id);

    public List<Orders> findOrderAndUserByLazyLoading();

}