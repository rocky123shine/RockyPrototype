package com.study.rocky.rockyprototype.step2;

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
            //此时不需要判断是个人业务 还是 企业订单
            // 达到拆单要求 新的单 数量为100
            newOrder = order.cloneOrder();
            newOrder.setOrderNum(100);
            orders.add(newOrder);
            //原订单 减去 新单数量 以保证单数总量不变
            order.setOrderNum(order.getOrderNum() - 100);
        }
        orders.add(order);
        return orders;
    }
}
