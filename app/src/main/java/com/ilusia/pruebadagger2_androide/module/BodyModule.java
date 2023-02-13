package com.ilusia.pruebadagger2_androide.module;

import com.ilusia.pruebadagger2_androide.bodyparts.Arm;
import com.ilusia.pruebadagger2_androide.bodyparts.Body;
import com.ilusia.pruebadagger2_androide.bodyparts.Head;
import com.ilusia.pruebadagger2_androide.bodyparts.Leg;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BodyModule {

    @Provides
    @Singleton
    public Head provideHead(){
        return new Head("Head");
    }

    @Provides
    @Singleton
    @Named("armL")
    public Arm provideArmL(){
        return new Arm("Arm left");
    }

    @Provides
    @Singleton
    @Named("armR")
    public Arm provideArmR(){
        return new Arm("Arm right");
    }

    @Provides
    @Singleton
    @Named("legL")
    public Leg provideLegL(){
        return new Leg("Leg left");
    }

    @Provides
    @Singleton
    @Named("legR")
    public Leg provideLegR(){
        return new Leg("Leg right");
    }

    @Provides
    @Singleton
    public Body provideBody(
            Head head,
            @Named("armR") Arm armR,
            @Named("armL") Arm armL,
            @Named("legL") Leg legL,
            @Named("legR") Leg legR
    ){
        return new Body(head,armR, armL,legL,legR);
    }

}
