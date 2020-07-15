package com.hj.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//必须实现implements InvocationHandler接口，完成代理类要做的功能（1. 调用目标方法 2.功能增加）
public class MySellHandler implements InvocationHandler {
    /*
        动态代理：目标对象是获得，不是固定的，需要传入进来
        传入是谁，就给谁创建代理
    */
    private Object target = null;
    public MySellHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        //1. 调用目标方法
        //float price = factory.sell(amount);
        res = method.invoke(target,args); //执行目标方法


        //2. 功能增加（加价格）
        if(res != null){
            Float price = (Float)res;
            price = price +25;
            res = price;
        }

        //3. 增加的价格
        return res;
    }
}
