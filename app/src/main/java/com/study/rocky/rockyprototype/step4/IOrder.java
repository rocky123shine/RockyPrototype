package com.study.rocky.rockyprototype.step4;

/**
 * Created by Administrator on 2018/4/18 0018.
 */

//实现系统自带clone、 系统接口 必须通过类来实现方法 这里用AbsOrder
public interface IOrder extends Cloneable {
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
