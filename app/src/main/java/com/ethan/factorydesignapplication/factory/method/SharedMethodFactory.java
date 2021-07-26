package com.ethan.factorydesignapplication.factory.method;

import com.ethan.factorydesignapplication.store.ISaveHandler;
import com.ethan.factorydesignapplication.store.SharedPreferenceHandler;

/**
 * SharedPreference 工厂
 */
public class SharedMethodFactory implements IFactory{
    @Override
    public ISaveHandler createHandler() {
        return SharedPreferenceHandler.getInstance();
    }
}
