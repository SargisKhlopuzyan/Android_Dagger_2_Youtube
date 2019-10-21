package com.example.dagger2.dagger;

import com.example.dagger2.MainActivity;
import com.example.dagger2.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Joomag, Inc., on 10/18/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 * <p>
 * <p>
 * The Injector
 */

@Component(modules = {WheelsModule.class, PetrolEngineModule.class}) //annotation processing
public interface CarComponent {

    Car getCar();

    //Field injection
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }
}
