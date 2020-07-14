package com.hj.shangjia;


import com.hj.factory.UsbKingFactory;
import com.hj.service.UsbSell;

//TaoBao是一个商家，代理金士顿U盘的销售
public class TaoBao implements UsbSell {

    //声明 商家代理的厂家具体是谁
    private UsbKingFactory factory = new UsbKingFactory();

    @Override
//实现销售U盘的功能
    public float sell(int amount) {
        //向厂家发送订单，告诉厂家，我买了U盘，厂家发货
        float price = factory.sell(amount);

        //增强功能：商家需要加价，也就是代理需要增加价格(也就是说：在目标类的方法调用后，你做的其他功能，都是增加的意思)
        price = price +25;
        //增加的价格
        return price;
    }
}
