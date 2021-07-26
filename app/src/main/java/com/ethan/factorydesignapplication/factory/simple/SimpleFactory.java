package com.ethan.factorydesignapplication.factory.simple;

import android.util.LruCache;

import com.ethan.factorydesignapplication.BaseApplication;
import com.ethan.factorydesignapplication.store.DiskStoreHandler;
import com.ethan.factorydesignapplication.store.ISaveHandler;
import com.ethan.factorydesignapplication.store.MemoryHandler;
import com.ethan.factorydesignapplication.store.SharedPreferenceHandler;

/**
 * 简单工厂
 */
public class SimpleFactory {
    private SimpleFactory() {
    }
    public enum StoreType {
        TYPE_SHARED,
        TYPE_MEMORY,
        TYPE_DISK
    }
    public static ISaveHandler createStore(StoreType type) {
        switch (type) {
            case TYPE_SHARED:
                return SharedPreferenceHandler.getInstance();
            case TYPE_MEMORY:
                return MemoryHandler.getInstance();
            case TYPE_DISK:
                return DiskStoreHandler.getInstance();
        }
        return SharedPreferenceHandler.getInstance();
    }
}
