package com.girish.daggerlearning;

import android.app.Application;

public class MyApplication extends Application {

    private static MyComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerMyComponent
                .builder()
                .build();
    }

    static MyComponent getMyComponent() {
       return mComponent;
    }
}
