package com.ethan.factorydesignapplication.factory.method;

import com.ethan.factorydesignapplication.store.ISaveHandler;

public interface IFactory {

    ISaveHandler createHandler();
}
