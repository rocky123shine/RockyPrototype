package com.study.rocky.rockyprototype.step2;

/**
 * Created by Administrator on 2018/4/18 0018.
 */

public interface IOrder extends IOrderCloneable{
//    拆单和个体企业 都是和订单有关，因此抽出来

    /**
     * 设置单数
     *
     * @param num
     */
    void setOrderNum(int num);

    /**
     * 得到单数
     *
     * @return
     */
    int getOrderNum();
}
