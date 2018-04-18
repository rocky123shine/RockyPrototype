package com.study.rocky.rockyprototype.step1;

import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/18 0018.
 */

//拆分业务
public class DealOrder {

    public static List<IOrder> getOrder(IOrder order) {
        List<IOrder> orders = new ArrayList<>();
        IOrder newOrder = null;
        //例如 100为拆分点
        //订单 大于100 拆单 不大于 直接加入集合
        while (order.getOrderNum() > 100) {
            //此时要判断是个人业务 还是 企业订单

            if (order instanceof PersonalOrder) {
                PersonalOrder personalOrder = (PersonalOrder) order;
                PersonalOrder newP = new PersonalOrder();
                //简单的赋值  统一用户订单  订单名和用户名一样
                newP.setOrder_name(personalOrder.getOrder_name());
                newP.setUser(personalOrder.getUser());
                newOrder = newP;
            } else if (order instanceof BusinessOrder) {
                BusinessOrder businessOrder = (BusinessOrder) order;
                BusinessOrder newB = new BusinessOrder();
                newB.setOrder_name(businessOrder.getOrder_name());
                newB.setUser(businessOrder.getUser());
                newOrder = newB;
            }

            if (newOrder != null) {
//                达到拆单要求 新的单 数量为100
                newOrder.setOrderNum(100);
                orders.add(newOrder);
                //原订单 减去 新单数量 以保证单数总量不变
                order.setOrderNum(order.getOrderNum() - 100);
            }

        }
        orders.add(order);
        return orders;
    }
}
