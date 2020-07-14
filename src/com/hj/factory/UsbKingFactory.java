package com.hj.factory;


import com.hj.service.UsbSell;

/**
 * 目标类：金士顿厂家，不接受用户的单独购买
 * 1. 快捷键Ctrl+0，继承接口的实现类
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        //一个128G的U盘是85元
        //后期根据amount，可以根据不同的价格，例如10000个，单机是80,50000个价格是75
        return 85.0f;
    }
}
