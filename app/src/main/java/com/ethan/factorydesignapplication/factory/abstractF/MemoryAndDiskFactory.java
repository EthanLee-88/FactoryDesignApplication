package com.ethan.factorydesignapplication.factory.abstractF;

import com.ethan.factorydesignapplication.store.ISaveHandler;

/**
 * 生产 Memory 和 Disk两种存储方式
 */
public class MemoryAndDiskFactory implements AbstractFactory{
    @Override
    public ISaveHandler createHandlerOne() {
        return null;
    }
    @Override
    public ISaveHandler createHandlerTwo() {
        return null;
    }
}
