package com.i2donate.Interwork;

import android.app.Application;
import android.util.Log;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.FirebaseApp;
import com.i2donate.R;
import twitter4j.*;

public class MyApplication extends Application {

    private static MyApplication mInstance;
    static String TAG = MyApplication.class.getSimpleName();
    static {
        System.loadLibrary("native-lib");
    }
    public static native String getSheetApiKey();
    public static native String getSheetId();

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        mInstance = this;
        FirebaseApp.initializeApp(this);


    }

    public static synchronized MyApplication getInstance() {
        if (mInstance == null) {
            Log.e(TAG, "mInstance null");
        } else {
            Log.e(TAG, "mInstance - " + mInstance);
        }
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}
