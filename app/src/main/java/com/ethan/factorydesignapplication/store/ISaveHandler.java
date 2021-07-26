package com.ethan.factorydesignapplication.store;

/**
 * String 、int、boolean类型数据存储接口
 */
public interface ISaveHandler {

    String getString(String key);

    int getInt(String key);

    boolean getBoolean(String key);

    ISaveHandler putString(String key, String value);

    ISaveHandler putInt(String key, int value);

    ISaveHandler putBoolean(String key, boolean value);
}
