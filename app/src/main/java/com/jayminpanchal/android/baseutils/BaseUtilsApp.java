package com.jayminpanchal.android.baseutils;

import android.app.Application;

/**
 * Created by Reshma on 11/19/2016.
 */
public class BaseUtilsApp extends Application {

    private static BaseUtilsApp appInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        appInstance = this;
    }

    public static BaseUtilsApp getAppInstance() {
        return appInstance;
    }
}
