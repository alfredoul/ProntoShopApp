package com.lucatecno.prontoshopapp.dagger;

import com.lucatecno.prontoshopapp.MainActivity;
import com.lucatecno.prontoshopapp.ProductListener;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alfredoul on 14/04/17.
 */

@Singleton
@Component(
        modules = {
                AppModule.class,
                ShoppingCartModule.class
        }
)
public interface AppComponent {
    void inject(ProductListener presenter);
    void inject(MainActivity activity);

}