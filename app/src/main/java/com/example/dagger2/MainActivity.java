package com.example.dagger2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2.car.Car;
import com.example.dagger2.car.DieselEngine;
import com.example.dagger2.dagger.CarComponent;
import com.example.dagger2.dagger.DaggerCarComponent;
import com.example.dagger2.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent component = DaggerCarComponent.create();

        CarComponent component = DaggerCarComponent
                .builder()
                .horsePower(150)
                .engineCapacity(100)
                .build();

        //First way to create a car
//        car = component.getCar();

        //Second way to create a car
        //Field injection
        component.inject(this);

        car.drive();
    }
}
