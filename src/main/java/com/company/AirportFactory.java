package com.company;

import com.google.inject.assistedinject.Assisted;

public interface AirportFactory {

    Airport createAirport(@Assisted("name") String name);
    Airport createAirport(@Assisted("capacity") int capacity, @Assisted("name") String name);

}
