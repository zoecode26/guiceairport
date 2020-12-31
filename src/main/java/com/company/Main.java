package com.company;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BindingModule());
        AirportFactory factory = injector.getInstance(AirportFactory.class);

	    Plane BA123 = new Plane("BA123");
        Plane BA456 = new Plane("BA456");

        Airport Heathrow = factory.createAirport("Heathrow");
        Airport Gatwick = factory.createAirport(200, "Gatwick");

        //EXAMPLE OF USAGE:
        Heathrow.land(BA123);
        Heathrow.land(BA456);
        Heathrow.display_planes();
        System.out.println();

        Heathrow.take_off(BA456);
        Heathrow.display_planes();
        System.out.println();

        Gatwick.land(BA456);
        Gatwick.display_planes();
        Gatwick.take_off(BA123);

    }
}
