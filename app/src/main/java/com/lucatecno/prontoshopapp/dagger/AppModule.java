package com.lucatecno.prontoshopapp.dagger;

import android.content.Context;

import com.lucatecno.prontoshopapp.ProntoShopApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by alfredoul on 14/04/17.
 */

@Module
public class AppModule {
    private final ProntoShopApplication app;

    public AppModule(ProntoShopApplication app) {
        this.app = app;
    }


    @Provides
    @Singleton
    public Context provideContext() {
        return app;
    }
}