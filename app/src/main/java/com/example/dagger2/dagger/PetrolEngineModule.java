package com.example.dagger2.dagger;

import com.example.dagger2.car.Engine;
import com.example.dagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Joomag, Inc., on 10/18/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
@Module
public abstract class PetrolEngineModule {

    //TODO-comment: bind method only takes one argument which is the implementation of the required Engine interface
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

    //This is if abstract
//    @Provides
//    Engine provideEngine(PetrolEngine engine) {
//        return engine;
//    }

}
