package com.example.dagger2.dagger;

import com.example.dagger2.car.Wheels;
import com.example.dagger2.car.components.Rims;
import com.example.dagger2.car.components.Tires;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Joomag, Inc., on 10/18/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
