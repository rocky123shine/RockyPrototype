package com.study.rocky.rockyprototype.step1;

import com.study.rocky.rockyprototype.user.PersonalUser;

/**
 * Created by Administrator on 2018/4/18 0018.
 */

//个人订单
public class PersonalOrder implements IOrder{

//    属性有 订单名称，订单数量，客户姓名
    private String order_name;
    private PersonalUser user;
    private int order_num;

    public String getOrder_name() {
        return order_name;
    }

    public PersonalOrder setOrder_name(String order_name) {
        this.order_name = order_name;
        return this;
    }



    @Override
    public void setOrderNum(int num) {
        this.order_num = num;
    }

    @Override
    public int getOrderNum() {
        return order_num;
    }

    public PersonalUser getUser() {
        return user;
    }

    public PersonalOrder setUser(PersonalUser user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "order_name='" + order_name + '\'' +
                ", user=" + user +
                ", order_num=" + order_num +
                '}';
    }
}
