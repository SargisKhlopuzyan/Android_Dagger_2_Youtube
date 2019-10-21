package com.example.dagger2.car;

import android.util.Log;

import com.example.dagger2.car.components.Remote;

import javax.inject.Inject;

/**
 * Created by Joomag, Inc., on 10/17/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
public class Car {

    private static final String TAG = "Car";

    //Fields injection
//    @Inject Engine engine;
    private Engine engine;
    private Wheels wheels;

    //Constructor injection
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    //Method injection
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
    }
}
