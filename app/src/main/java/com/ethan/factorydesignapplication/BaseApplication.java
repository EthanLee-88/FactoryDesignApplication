package com.ethan.factorydesignapplication;

import android.app.Application;
import android.content.Context;

public class BaseApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getBaseApplicationContext(){
        return mContext;
    }
}
