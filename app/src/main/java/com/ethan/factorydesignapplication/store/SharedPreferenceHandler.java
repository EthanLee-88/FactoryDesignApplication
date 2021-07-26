package com.ethan.factorydesignapplication.store;

import android.content.Context;
import android.content.SharedPreferences;

import com.ethan.factorydesignapplication.BaseApplication;

/**
 * SharedPreference 缓存
 */
public class SharedPreferenceHandler implements ISaveHandler{

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    private Context mContext;

    private SharedPreferenceHandler(){
        initRes();
    }

    private static class ShareHolder{
        public static SharedPreferenceHandler mHolder = new SharedPreferenceHandler();
    }

    public static SharedPreferenceHandler getInstance(){
        return ShareHolder.mHolder;
    }

    private void initRes(){
        mContext = BaseApplication.getBaseApplicationContext();
        mSharedPreferences = mContext.getSharedPreferences("Factory_Share_Store", Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();
    }

    @Override
    public String getString(String key){
        return mSharedPreferences.getString(key,"default");
    }
    @Override
    public int getInt(String key){
        return mSharedPreferences.getInt(key,-1);
    }
    @Override
    public boolean getBoolean(String key){
        return mSharedPreferences.getBoolean(key, false);
    }
    @Override
    public SharedPreferenceHandler putString(String key, String value){
        mEditor.putString(key, value);
        return this;
    }
    @Override
    public SharedPreferenceHandler putInt(String key, int value){
        mEditor.putInt(key, value);
        return this;
    }
    @Override
    public SharedPreferenceHandler putBoolean(String key, boolean value){
        mEditor.putBoolean(key, value);
        return this;
    }
    public void commit(){
        mEditor.commit();
    }

}
