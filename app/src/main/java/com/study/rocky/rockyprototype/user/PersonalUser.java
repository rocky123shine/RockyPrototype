package com.study.rocky.rockyprototype.user;


/**
 * Created by Administrator on 2018/4/18 0018.
 */

public class PersonalUser implements IUser {
    private String personal_name;
    private int age;

    @Override
    public void setUserName(String userName) {
        this.personal_name = userName;
    }

    @Override
    public String getUserName() {
        return personal_name;
    }

    public PersonalUser setAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonalUser{" +
                "personal_name='" + personal_name + '\'' +
                ", age=" + age +
                '}';
    }
}
