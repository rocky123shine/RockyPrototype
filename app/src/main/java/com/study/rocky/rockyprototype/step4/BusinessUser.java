package com.study.rocky.rockyprototype.step4;


/**
 * Created by Administrator on 2018/4/18 0018.
 */

public class BusinessUser implements IUser {
    private String business_name;
    private String business_address;

    public BusinessUser setBusiness_address(String business_address) {
        this.business_address = business_address;
        return this;
    }

    public String getBusiness_address() {
        return business_address;
    }

    @Override
    public void setUserName(String userName) {
        this.business_name = userName;
    }

    @Override
    public String getUserName() {
        return business_name;
    }

    @Override
    public String toString() {
        return "BusinessUser{" +
                "business_name='" + business_name + '\'' +
                ", business_address='" + business_address + '\'' +
                '}';
    }

    @Override
    protected BusinessUser clone() throws CloneNotSupportedException {
        return (BusinessUser) super.clone();
    }
}
