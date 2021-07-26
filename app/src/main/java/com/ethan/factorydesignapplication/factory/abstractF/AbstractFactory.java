package com.ethan.factorydesignapplication.factory.abstractF;

import com.ethan.factorydesignapplication.store.ISaveHandler;

public interface AbstractFactory {

    ISaveHandler createHandlerOne();

    ISaveHandler createHandlerTwo();
}
