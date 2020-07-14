package com.hj;

import com.hj.shangjia.TaoBao;

public class ShopMain {
    public static void main(String[] args) {
        //创建代理的商家TaoBao对象
        TaoBao taobao = new TaoBao();
        float price = taobao.sell(1);
        System.out.println("通过淘宝的商家，购买U盘单价："+price);
    }
}
