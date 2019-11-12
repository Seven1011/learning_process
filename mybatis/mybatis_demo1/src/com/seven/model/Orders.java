package com.seven.model;

import java.io.Serializable;
import java.util.List;

public class Orders  {
    private int id;
    private String user_id; //用户id
    private String number;    //数量
    private String createtime;   //创建日期
    private String note;    //备注



    private User user;//定单所属的用户

    //订单明细
    private List<OrderDetail> orderDetails;

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", number='" + number + '\'' +
                ", createtime='" + createtime + '\'' +
                ", note='" + note + '\'' +
                ", user=" + user +
                '}';
    }
}
