package com.company;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class BindingModule extends AbstractModule {
    @Override
    protected void configure(){
        install(new FactoryModuleBuilder()
                .implement(Airport.class, AirportImpl.class)
                .build(AirportFactory.class));
    }
}
