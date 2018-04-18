package com.study.rocky.rockyprototype.step1;

import com.study.rocky.rockyprototype.user.BusinessUser;

/**
 * Created by Administrator on 2018/4/18 0018.
 */

//企业 订单
public class BusinessOrder implements IOrder{
//    订单名称 订单数量 企业名
private String order_name;
    private BusinessUser user;
    private int order_num;

    @Override
    public void setOrderNum(int num) {
        this.order_num = num;
    }

    @Override
    public int getOrderNum() {
        return order_num;
    }

    public String getOrder_name() {
        return order_name;
    }

    public BusinessOrder setOrder_name(String order_name) {
        this.order_name = order_name;
        return this;
    }

    public BusinessUser getUser() {
        return user;
    }

    public BusinessOrder setUser(BusinessUser user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return "BusinessOrder{" +
                "order_name='" + order_name + '\'' +
                ", user=" + user +
                ", order_num=" + order_num +
                '}';
    }
}
