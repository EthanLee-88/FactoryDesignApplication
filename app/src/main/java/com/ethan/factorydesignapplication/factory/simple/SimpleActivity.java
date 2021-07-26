package com.ethan.factorydesignapplication.factory.simple;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ethan.factorydesignapplication.store.ISaveHandler;

import static com.ethan.factorydesignapplication.store.KeysUtil.KEY_USER_NAME;

public class SimpleActivity extends AppCompatActivity {
    private static final String TAG = "SimpleActivity";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        init();
    }
    private void init() {
        ISaveHandler iSaveHandler = SimpleFactory.createStore(SimpleFactory.StoreType.TYPE_SHARED);

        iSaveHandler.putString(KEY_USER_NAME, "碧云天");
        String name = iSaveHandler.getString(KEY_USER_NAME);
        Log.d(TAG, "name = " + name);
    }
}
