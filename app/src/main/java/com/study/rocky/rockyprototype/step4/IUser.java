package com.study.rocky.rockyprototype.step4;

/**
 * Created by Administrator on 2018/4/18 0018.
 */

//统一用户信息 如名字
public interface IUser extends Cloneable{
    void setUserName(String userName);

    String getUserName();
}
