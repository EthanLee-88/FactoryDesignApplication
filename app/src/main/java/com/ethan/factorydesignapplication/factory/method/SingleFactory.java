package com.ethan.factorydesignapplication.factory.method;

import com.ethan.factorydesignapplication.store.ISaveHandler;

/**
 * 工厂方法
 *
 * 单工厂形式
 */
public class SingleFactory{
    public static ISaveHandler createHandler(Class<? extends ISaveHandler> clz) {
        try {
            // 反射创建对象
            return clz.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
