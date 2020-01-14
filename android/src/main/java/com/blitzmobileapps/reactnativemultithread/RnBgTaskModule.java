
package com.blitzmobileapps.reactnativemultithread;


import android.os.Handler;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RnBgTaskModule extends ReactContextBaseJavaModule  {
    private String MODULE_NAME = "RnBgTask";
    public RnBgTaskModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void runInBackground(final Callback callback){
        BgThread th = new BgThread(callback);
        th.start();

    }

    @NonNull
    @Override
    public String getName() {
        return MODULE_NAME;
    }
    
}

class BgThread extends Thread implements Runnable{
    Callback callback;
    public BgThread(Callback cb){
            this.callback = cb;
    }
    @Override
    public void run() {

        this.callback.invoke();
    }
}
