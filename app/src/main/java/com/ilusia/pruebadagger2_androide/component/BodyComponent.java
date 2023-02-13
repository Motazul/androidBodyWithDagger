package com.ilusia.pruebadagger2_androide.component;

import com.ilusia.pruebadagger2_androide.MainActivity;
import com.ilusia.pruebadagger2_androide.module.BodyModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {BodyModule.class})
public interface BodyComponent {
    void inject(MainActivity mainActivity);
}
