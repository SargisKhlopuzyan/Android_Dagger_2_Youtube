package com.example.dagger2.car;

import com.example.dagger2.car.components.Rims;
import com.example.dagger2.car.components.Tires;

/**
 * Created by Joomag, Inc., on 10/17/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
public class Wheels {

    private Tires tires;
    private Rims rims;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
//
//    @Inject
//    public Wheels() {
//    }
}
