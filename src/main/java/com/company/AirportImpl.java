package com.company;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

public class AirportImpl extends Airport{

    @AssistedInject
    public AirportImpl(@Assisted("name") String name){
        //Passes these arguments to appropriate airport constructor
        super(100, name);
    }

    @AssistedInject
    public AirportImpl(@Assisted("capacity") int capacity, @Assisted("name") String name){
        super(capacity, name);
    }

}
