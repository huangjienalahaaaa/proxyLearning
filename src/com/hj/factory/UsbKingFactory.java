package com.hj.factory;


import com.hj.service.UsbSell;

//目标类
public class UsbKingFactory implements UsbSell {
    //目标方法
    @Override
    public float sell(int amount) {
        return 85.0f;
    }
}
