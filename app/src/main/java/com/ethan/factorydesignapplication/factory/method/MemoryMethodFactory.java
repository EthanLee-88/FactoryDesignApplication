package com.ethan.factorydesignapplication.factory.method;

import com.ethan.factorydesignapplication.store.ISaveHandler;
import com.ethan.factorydesignapplication.store.MemoryHandler;

/**
 * 内存存储工厂
 */
public class MemoryMethodFactory implements IFactory{

    @Override
    public ISaveHandler createHandler() {
        return MemoryHandler.getInstance();
    }
}
