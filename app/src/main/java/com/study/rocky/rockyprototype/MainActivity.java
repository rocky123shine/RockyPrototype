package com.study.rocky.rockyprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.study.rocky.rockyprototype.step4.AbsOrder;
import com.study.rocky.rockyprototype.step4.BusinessOrder;
import com.study.rocky.rockyprototype.step4.DealOrder;
import com.study.rocky.rockyprototype.step4.PersonalOrder;
import com.study.rocky.rockyprototype.step4.PersonalUser;


import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //现在有以下需求 ：
        //1.快递送件 数量到一定程度 拆单
        //2.客户分不同类型，个人和企业

        //step1 最直观的实现

//        PersonalOrder personalOrder = new PersonalOrder();
//        personalOrder.setOrder_name("太阳镜");
//        personalOrder.setOrderNum(110);
//        PersonalUser personalUser = new PersonalUser();
//        personalUser.setAge(25);
//        personalUser.setUserName("Rocky");
//        personalOrder.setUser(personalUser);
//
//
//        BusinessOrder businessOrder = new BusinessOrder();
//        businessOrder.setOrder_name("平板电脑");
//        businessOrder.setOrderNum(308);
//        BusinessUser businessUser = new BusinessUser();
//        businessUser.setBusiness_address("南开区 时代奥成");
//        businessUser.setUserName("Rocky");
//        businessOrder.setUser(businessUser);


//        PersonalOrder personalOrder = new PersonalOrder();
//        personalOrder.setOrder_name("太阳镜");
//        personalOrder.setOrderNum(110);
//        PersonalUser personalUser = new PersonalUser();
//        personalUser.setAge(25);
//        personalUser.setUserName("Rocky");
//        personalOrder.setUser(personalUser);
//
//
//        BusinessOrder businessOrder = new BusinessOrder();
//        businessOrder.setOrder_name("平板电脑");
//        businessOrder.setOrderNum(308);
//        BusinessUser businessUser = new BusinessUser();
//        businessUser.setBusiness_address("南开区 时代奥成");
//        businessUser.setUserName("Rocky");
//        businessOrder.setUser(businessUser);
//        List<IOrder> order = DealOrder.getOrder(personalOrder);
//        for (IOrder iOrder : order) {
//            Log.d("MainActivity", "测试结果：" + iOrder.toString());
//        }
//        for (IOrder iOrder : DealOrder.getOrder(businessOrder)) {
//            Log.e("MainActivity", "测试结果：" + iOrder.toString());
//
//        }

        //step2  step1中我们可以发现 业务处理的时候 要判断订单类型 两种还行 要是有很多种 代码将会很臃肿
        //改进step1的业务逻辑 使用浅克隆 自定义clone 接口

        //step3 同step2  只是用的是 系统提供的接口
        //step4 使用深克隆


        //我们来测试一下 step3 和 step4

        /**
         * 三的结果  测试结果11111111 是原来的数据
         * 04-18 07:16:53.604 28243-28243/? D/MainActivity: 测试结果11111111：PersonalOrder{order_name='太阳镜', user=PersonalUser{personal_name='RockyCopy', age=25}, order_num=10}
         04-18 07:16:53.604 28243-28243/? D/MainActivity: 测试结果：PersonalOrder{order_name='太阳镜', user=PersonalUser{personal_name='RockyCopy', age=25}, order_num=100}
         04-18 07:16:53.604 28243-28243/? D/MainActivity: 测试结果11111111：PersonalOrder{order_name='太阳镜', user=PersonalUser{personal_name='RockyCopy', age=25}, order_num=10}
         04-18 07:16:53.604 28243-28243/? D/MainActivity: 测试结果：PersonalOrder{order_name='太阳镜', user=PersonalUser{personal_name='RockyCopy', age=25}, order_num=10}
         */
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrder_name("太阳镜");
        personalOrder.setOrderNum(110);
        PersonalUser personalUser = new PersonalUser();
        personalUser.setAge(25);
        personalUser.setUserName("Rocky");
        personalOrder.setUser(personalUser);
        try {
            List<AbsOrder> order = DealOrder.getOrder(personalOrder);
            personalUser.setUserName("RockyCopy");

            for (AbsOrder absOrder : order) {
                Log.d("MainActivity", "测试结果：" + absOrder.toString());
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }








    }
}
