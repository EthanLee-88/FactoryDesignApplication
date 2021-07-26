package com.ethan.factorydesignapplication.store;

public class DiskStoreHandler implements ISaveHandler{

    private DiskStoreHandler(){

    }

    private static class DiskHolder{
        public static DiskStoreHandler mHolder = new DiskStoreHandler();
    }

    public static DiskStoreHandler getInstance(){
        return DiskHolder.mHolder;
    }

    @Override
    public String getString(String key) {
        return null;
    }

    @Override
    public int getInt(String key) {
        return 0;
    }

    @Override
    public boolean getBoolean(String key) {
        return false;
    }

    @Override
    public ISaveHandler putString(String key, String value) {
        return null;
    }

    @Override
    public ISaveHandler putInt(String key, int value) {
        return null;
    }

    @Override
    public ISaveHandler putBoolean(String key, boolean value) {
        return null;
    }
}
