package com.ethan.factorydesignapplication.factory.abstractF;

import com.ethan.factorydesignapplication.store.ISaveHandler;
import com.ethan.factorydesignapplication.store.MemoryHandler;
import com.ethan.factorydesignapplication.store.SharedPreferenceHandler;

/**
 * 生产 SharedPreference 和 Memory两种存储方式
 */
public class SharedAndMemoryFactory implements AbstractFactory{
    @Override
    public ISaveHandler createHandlerOne() {
        return SharedPreferenceHandler.getInstance();
    }

    @Override
    public ISaveHandler createHandlerTwo() {
        return MemoryHandler.getInstance();
    }
}
