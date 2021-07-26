package com.ethan.factorydesignapplication.factory.abstractF;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ethan.factorydesignapplication.factory.method.IFactory;
import com.ethan.factorydesignapplication.factory.method.SharedMethodFactory;
import com.ethan.factorydesignapplication.factory.method.SingleFactory;
import com.ethan.factorydesignapplication.store.ISaveHandler;
import com.ethan.factorydesignapplication.store.SharedPreferenceHandler;

import static com.ethan.factorydesignapplication.store.KeysUtil.KEY_USER_NAME;

public class AbstractFactoryActivity extends AppCompatActivity {

    private static final String TAG = "SimpleActivity";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        init();
    }

    private void init() {
        AbstractFactory iFactory = new SharedAndMemoryFactory();

        ISaveHandler shared = iFactory.createHandlerOne();

        ISaveHandler memory = iFactory.createHandlerTwo();

        shared.putString(KEY_USER_NAME, "碧云天");
        String name = shared.getString(KEY_USER_NAME);
        Log.d(TAG, "name = " + name);

    }


}
