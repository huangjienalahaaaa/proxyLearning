package com.hj;


import com.hj.factory.UsbKingFactory;
import com.hj.handler.MySellHandler;
import com.hj.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ShopMain {
    public static void main(String[] args) {
     //创建代理对象，使用proxy

        //1. 创建目标对象
        UsbSell factory = new UsbKingFactory();


        //2. 创建InvocationHandler对象
        InvocationHandler handler = new MySellHandler(factory);


        //3. 创建代理对象
      UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
              factory.getClass().getInterfaces(),
              handler
              );

        //4. 通过代理执行方法：
       float price = proxy.sell(1);




    }
}
