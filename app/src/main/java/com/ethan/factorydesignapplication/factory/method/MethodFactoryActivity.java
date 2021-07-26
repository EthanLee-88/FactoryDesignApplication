package com.ethan.factorydesignapplication.factory.method;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ethan.factorydesignapplication.factory.simple.SimpleFactory;
import com.ethan.factorydesignapplication.store.ISaveHandler;
import com.ethan.factorydesignapplication.store.SharedPreferenceHandler;

import static com.ethan.factorydesignapplication.store.KeysUtil.KEY_USER_NAME;

public class MethodFactoryActivity extends AppCompatActivity {

    private static final String TAG = "SimpleActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        init();
    }

    private void init() {
        IFactory iFactory = new SharedMethodFactory();
        ISaveHandler iSaveHandler = iFactory.createHandler();

        iSaveHandler.putString(KEY_USER_NAME, "碧云天");
        String name = iSaveHandler.getString(KEY_USER_NAME);
        Log.d(TAG, "name = " + name);

        SingleModel();
    }

    private void SingleModel() {
        ISaveHandler iSaveHandler = SingleFactory.createHandler(SharedPreferenceHandler.class);

        assert iSaveHandler != null;
        iSaveHandler.putString(KEY_USER_NAME, "长亭外");
        String name = iSaveHandler.getString(KEY_USER_NAME);
        Log.d(TAG, "name = " + name);
    }

}
