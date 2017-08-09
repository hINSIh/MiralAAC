package com.miral.aac;

import android.app.Application;

/**
 * Created by moistmushroom on 2017. 8. 3..
 */

public class MiralApplication extends Application {
    private static Application instance;

    public static Application getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
