package com.example.dagger2.car.components;

import android.util.Log;

import com.example.dagger2.car.Car;

import javax.inject.Inject;

/**
 * Created by Joomag, Inc., on 10/18/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
public class Remote {

    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
