package com.hj.service;

//定义接口，表示功能的，厂家，商家都要完成的功能
public interface UsbSell {

    /**
     * 定义方法：
     * amount :表示一次购买的数量，暂时不用
     * 返回值表示一个U盘的价格
     */
    float sell(int amount);

//    当然，这里也可以定义其他的方法
}
