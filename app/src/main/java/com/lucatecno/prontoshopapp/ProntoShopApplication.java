package com.lucatecno.prontoshopapp;

import android.app.Application;
import android.content.Context;

import com.lucatecno.prontoshopapp.dagger.AppComponent;
import com.lucatecno.prontoshopapp.dagger.AppModule;
import com.lucatecno.prontoshopapp.dagger.DaggerAppComponent;

/**
 * Created by alfredoul on 14/04/17.
 */

public class ProntoShopApplication extends Application {

    private static ProntoShopApplication instance = new ProntoShopApplication();
    private static AppComponent appComponent;

    public static ProntoShopApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        getAppComponent();
    }

    public AppComponent getAppComponent() {
        if (appComponent == null){
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return appComponent;
    }

}