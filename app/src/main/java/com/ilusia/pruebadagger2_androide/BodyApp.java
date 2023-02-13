package com.ilusia.pruebadagger2_androide;

import android.app.Application;

import com.ilusia.pruebadagger2_androide.component.BodyComponent;
import com.ilusia.pruebadagger2_androide.component.DaggerBodyComponent;
import com.ilusia.pruebadagger2_androide.module.BodyModule;

public class BodyApp extends Application {
    private BodyComponent bodyComponent;

    @Override
    public void onCreate(){
        super.onCreate();

       bodyComponent = DaggerBodyComponent.builder().bodyModule(new BodyModule()).build();
    }

    public BodyComponent getBodyComponent(){
        return bodyComponent;
    }
}
