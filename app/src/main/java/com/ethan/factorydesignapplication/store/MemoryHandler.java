package com.ethan.factorydesignapplication.store;

import android.content.Context;
import android.util.LruCache;

import com.ethan.factorydesignapplication.BaseApplication;

/**
 * LruCache 内存缓存
 */
public class MemoryHandler implements ISaveHandler{

    private Context mContext;
    private LruCache<String, Object> mLruCache;

    private MemoryHandler() {
        initRes();
    }

    @Override
    public String getString(String key) {
        return (String) mLruCache.get(key);
    }

    @Override
    public int getInt(String key) {
        return (int) mLruCache.get(key);
    }

    @Override
    public boolean getBoolean(String key) {
        return (boolean) mLruCache.get(key);
    }

    @Override
    public ISaveHandler putString(String key, String value) {
        mLruCache.put(key, value);
        return this;
    }

    @Override
    public ISaveHandler putInt(String key, int value) {
        mLruCache.put(key, value);
        return this;
    }

    @Override
    public ISaveHandler putBoolean(String key, boolean value) {
        mLruCache.put(key, value);
        return this;
    }

    private static class MemoryHolder {
        public static MemoryHandler mHolder = new MemoryHandler();
    }

    public static MemoryHandler getInstance() {
        return MemoryHolder.mHolder;
    }

    private void initRes() {
        mContext = BaseApplication.getBaseApplicationContext();
        int size = (int) (Runtime.getRuntime().maxMemory() / 1024 / 8);
        mLruCache = new LruCache<String, Object>(size){
            @Override
            protected int sizeOf(String key, Object value) {
                return super.sizeOf(key, value);
            }
        };
    }

}
