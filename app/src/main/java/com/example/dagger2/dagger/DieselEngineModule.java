package com.example.dagger2.dagger;

import com.example.dagger2.car.DieselEngine;
import com.example.dagger2.car.Engine;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Joomag, Inc., on 10/18/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }

}
