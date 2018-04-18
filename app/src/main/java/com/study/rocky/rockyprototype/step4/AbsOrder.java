package com.study.rocky.rockyprototype.step4;

/**
 * Created by Administrator on 2018/4/18 0018.
 */

public abstract  class AbsOrder implements IOrder {
    @Override
    protected AbsOrder clone() throws CloneNotSupportedException {
        return (AbsOrder) super.clone();
    }
}
